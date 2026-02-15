package Oct.Practice;

import java.util.Scanner;

/*
🎯 How To Explain This in Interview

"I first take a sentence as input from the user.
Then I split the sentence into words using space as delimiter.
To reverse both word order and characters, I iterate from the last word to the first word.
For each word, I reverse its characters using an inner loop and append it to the result.
Finally, I remove the extra trailing space using trim() and print the output.

Time Complexity: O(n) because every character is visited once
Space Complexity: O(n) for storing the result string"
*/

public class Ex21_ReverseWordsAndCharacters {

    public static void main(String[] args) {

        // Creating Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Asking user for sentence
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        // Splitting sentence into words based on space
        // Example: "I love java" -> ["I","love","java"]
        String[] arr = str.split(" ");

        // Variable to store final reversed sentence
        String result = "";

        /*
        LOGIC:

        Input:  I love coding with java
        Words:  [I, love, coding, with, java]

        Step 1 → Traverse from last word to first word
        java → with → coding → love → I

        Step 2 → Reverse characters of each word
        java   → avaj
        with   → htiw
        coding → gnidoc
        love   → evol
        I      → I

        Final Output → avaj htiw gnidoc evol I
        */

        // Loop to reverse order of words
        for(int i = arr.length - 1; i >= 0; i--) {

            // Current word
            String word = arr[i];

            // Store reversed version of current word
            String reversedWord = "";

            // Reverse characters inside the word
            for(int j = word.length() - 1; j >= 0; j--) {

                // Add characters from end to start
                reversedWord += word.charAt(j);
            }

            // Append reversed word + space to result
            result += reversedWord + " ";
        }

        // trim() removes last extra space
        System.out.println("Output: " + result.trim());

        sc.close(); // Close scanner resource
    }
}

/*
🧠 Interview Follow-Up Questions

Q1: Why nested loops?
A: Outer loop reverses word order, inner loop reverses characters

Q2: Time Complexity?
A: O(n)

Q3: Can we optimize?
A: Yes, using StringBuilder to avoid multiple string object creation

Q4: What if multiple spaces exist?
A: Use split("\\s+") instead of split(" ")

Q5: Difference from reversing whole string?
A: Whole string → "avaj htiw gnidoc evol I"
   Reverse words only → "java with coding love I"
*/
