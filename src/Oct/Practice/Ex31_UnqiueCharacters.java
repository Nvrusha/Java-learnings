package Oct.Practice;

import java.util.*;   // Needed for Map, LinkedHashMap, Scanner

/*
 🎯 HOW TO EXPLAIN IN INTERVIEW

 "To find unique (non-repeating) characters in a string,
  I first store the frequency of each character using a LinkedHashMap.
  LinkedHashMap is used so the insertion order is preserved.
  Then I iterate through the map and print characters whose frequency is 1.
  This approach takes O(n) time and O(n) space."

  NOTE:
  Unique character → appears only once
  Not the same as removing duplicates (Set)

*/

public class Ex31_UnqiueCharacters {

    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user for string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert to lowercase so 'V' and 'v' are treated same
        str = str.toLowerCase();

        // LinkedHashMap stores character → frequency
        // Maintains order of appearance
        Map<Character, Integer> map = new LinkedHashMap<>();

        // ------------------ STEP 1: COUNT FREQUENCY ------------------
        for(int i = 0; i < str.length(); i++) {

            // Extract character at each index
            char ch = str.charAt(i);

            // Ignore spaces
            if(ch != ' ') {

                // getOrDefault:
                // If character exists → return count
                // Else → return 0
                // Then increment count by 1
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        // ------------------ STEP 2: PRINT UNIQUE CHARACTERS ------------------
        System.out.print("Unique characters: ");

        // Iterate through map entries
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {

            // Character whose frequency is 1 → non-repeating
            if(entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }

        sc.close(); // good practice
    }
}
