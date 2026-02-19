package Oct.Practice;

import java.util.Scanner;

/*
🎯 INTERVIEW QUESTION:
Write a Java program to compress a string by printing
each character followed by its frequency.

Example:
Input:  aabbcccdd
Output: a2b2c3d2
*/

public class Ex33_StringCompression {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        // Edge case: if string is empty
        if (str == null || str.length() == 0) {
            System.out.println("Empty string.");
            return;
        }

        int count = 1;

        // Traverse string
        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result.append(str.charAt(i));
                result.append(count);
                count = 1;
            }
        }

        // Handle last character
        result.append(str.charAt(str.length() - 1));
        result.append(count);

        // Print result
        System.out.println("Compressed String: " + result);

        // Close scanner
        sc.close();
    }
}
