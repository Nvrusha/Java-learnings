package Oct.Practice;

import java.util.Scanner;

/*
 🎯 HOW TO EXPLAIN IN INTERVIEW

 "There are two ways to swap two strings.

  1️⃣ Using a third variable (recommended approach):
     - Store first string in a temporary variable.
     - Assign second string to first.
     - Assign temp value to second.
     - Simple, readable, and O(1) time.

  2️⃣ Without using a third variable:
     - Concatenate both strings.
     - Extract original first string using substring().
     - Extract original second string using substring().
     - Since String is immutable, new objects are created internally.
     - Time Complexity  : O(n)
     - Space Complexity : O(n)

  In real-world coding, the third variable approach is preferred."
*/

public class Ex32_Strings_Swap {

    public static void main(String[] args) {

        // ------------------ STEP 0: TAKE INPUT ------------------

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Store original values (for second method demonstration)
        String originalStr1 = str1;
        String originalStr2 = str2;


        // =========================================================
        // ✅ METHOD 1: WITHOUT USING THIRD VARIABLE
        // =========================================================

        System.out.println("\n--- Swapping Without Third Variable ---");

        // STEP 1: Concatenate both strings
        str1 = str1 + str2;

        // STEP 2: Extract original str1
        str2 = str1.substring(0, str1.length() - str2.length());

        // STEP 3: Extract original str2
        str1 = str1.substring(str2.length());

        // Print swapped result
        System.out.println("After Swapping:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);


        // =========================================================
        // ✅ METHOD 2: USING THIRD VARIABLE (Recommended)
        // =========================================================

        System.out.println("\n--- Swapping Using Third Variable ---");

        // Restore original values
        str1 = originalStr1;
        str2 = originalStr2;

        // STEP 1: Store str1 in temp
        String temp = str1;

        // STEP 2: Assign str2 to str1
        str1 = str2;

        // STEP 3: Assign temp to str2
        str2 = temp;

        // Print swapped result
        System.out.println("After Swapping:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        sc.close(); // good practice
    }
}
