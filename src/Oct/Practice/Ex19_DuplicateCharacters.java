package Oct.Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
🎯 How To Explain This in Interview

"I use a HashMap to store frequency of each character in the string.
While traversing the string, I update the count using getOrDefault(),
which avoids writing separate conditions for existing and new characters.
After counting frequencies, I iterate through the map entries and print
characters whose frequency is greater than one, which are duplicates.

Time Complexity: O(n)
Space Complexity: O(k) where k = unique characters
*/

public class Ex19_DuplicateCharacters {
    public static void main(String[] args) {

        // Creating scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Asking user to enter string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // HashMap to store character and its frequency
        // Key   -> Character
        // Value -> Number of occurrences
        Map<Character, Integer> map = new HashMap<>();

        /*
        LOGIC:
        Traverse the string character by character.
        Update frequency in HashMap.
        Ignore spaces while counting.
        */
        for(int i = 0; i < str.length(); i++) {

            // Extract each character
            char ch = str.charAt(i);

            // Skip spaces
            if(ch == ' ')
                continue;

            // getOrDefault(ch,0):
            // If character exists → returns current count
            // If not → returns 0
            // Then we add 1 and update map
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Display duplicate characters
        System.out.print("Duplicate characters: ");

        // Traverse map entries (key-value pairs)
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {

            // If frequency > 1 → duplicate found
            if(entry.getValue() > 1) {

                // Print duplicate character
                System.out.print(entry.getKey() + " -> " + entry.getValue() + " ");
            }
        }

        sc.close();
    }
}
