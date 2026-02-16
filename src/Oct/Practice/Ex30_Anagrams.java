package Oct.Practice;

import java.util.*;

/*
🎯 How To Explain This in Interview (Best Version)

Say this confidently:

"Two strings are called anagrams if they contain the same characters
with the same frequency but possibly in different order.

I first check the length because strings of different lengths
cannot be anagrams. Then I convert both strings to lowercase
to ignore case sensitivity. After that I convert them into
character arrays and sort both arrays alphabetically.

If the sorted arrays are equal, the strings are anagrams,
otherwise they are not."

This approach is simple and reliable for interview problems.
*/

public class Ex30_Anagrams {

    public static void main(String[] args) {

        // Creating Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Asking user to enter first string
        System.out.print("Enter 1st string: ");
        String str1 = scanner.nextLine();

        // Asking user to enter second string
        System.out.print("Enter 2nd string: ");
        String str2 = scanner.nextLine();

        // Step 1: Length check (quick rejection condition)
        if (str1.length() != str2.length()) {
            System.out.println("Given two strings are not anagram");
            return;  // stop execution if lengths differ
        }

        // Step 2: Convert both strings to lowercase (ignore case sensitivity)
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Step 3: Convert strings into character arrays
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        // Step 4: Sort both character arrays alphabetically
        Arrays.sort(a);
        Arrays.sort(b);

        // Step 5: Compare sorted arrays
        if (Arrays.equals(a, b)) {
            System.out.println("Given two strings are anagram");
        } else {
            System.out.println("Given two strings are not anagram");
        }

        scanner.close(); // Closing scanner resource
    }
}
