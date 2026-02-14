package Oct.Practice;

import java.util.Scanner;

public class Ex07_Reverse_Number {
    public static void main(String[] args) {

        // 1🔹 Reverse the number using a while loop (Input: 12345 → Output: 54321)

        // Create Scanner object to read input from console
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter a number
        System.out.print("Enter a number: ");

        // Read integer input from user
        int number = scanner.nextInt();

        // Store original number for display/reference later
        int originalNumber = number;

        // Variable to store the reversed number
        // Initialize with 0 because we will build the reversed number step-by-step
        int reversed = 0;

        /*
         * Logic Explanation:
         * We will extract digits one by one from the end of the number.
         * Example: 15786
         * Step 1 → Extract 6
         * Step 2 → Extract 8
         * Step 3 → Extract 7
         * Step 4 → Extract 5
         * Step 5 → Extract 1
         */

        // Loop runs until number becomes 0
        while (number != 0) {

            // Extract the last digit using modulus operator
            // % 10 gives remainder when divided by 10
            int digit = number % 10;

            /*
             * Append extracted digit to reversed number
             * Multiply reversed by 10 to shift digits left
             * Then add the new digit
             */
            reversed = reversed * 10 + digit;

            // Remove last digit from original number
            // Integer division automatically removes decimal part
            number = number / 10;
        }

        // Print original number
        System.out.println("Original Number: " + originalNumber);

        // Print reversed number
        System.out.println("Reversed Number: " + reversed);

        // Close scanner to prevent memory leak
        scanner.close();


        // 2🔹 Reverse the number using a for loop (Input: 123456789 → Output: 987654321)

//        int num1 = 123456789;   // Original number
//        int rev1 = 0;           // Variable to store the reversed number
//
//        // The loop continues until num1 becomes 0
//        // No initialization or update inside for parentheses, handled manually
//        for (; num1 != 0; ) {
//
//            // Step 1: Get the last digit using modulus operator (%)
//            int lastDigit1 = num1 % 10;
//
//            // Step 2: Multiply the existing reversed number by 10
//            // and add the extracted last digit to it
//            rev1 = rev1 * 10 + lastDigit1;
//
//            // Step 3: Remove the last digit from num1 by dividing it by 10
//            num1 /= 10;
//        }
//
//        // Step 4: Print the reversed number
//        System.out.println("Reversed number: " + rev1);




    }
}
