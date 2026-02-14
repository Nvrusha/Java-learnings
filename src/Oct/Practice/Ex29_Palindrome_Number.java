package Oct.Practice;

import java.util.Scanner;

public class Ex29_Palindrome_Number {
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Negative numbers are not considered palindrome
        if (number < 0) {
            System.out.println("Negative numbers are not Palindrome.");
            return;  // Exit program
        }

        // Store original number for comparison later
        int originalNumber = number;

        // Variable to store reversed number
        int reversed = 0;

        // Loop runs until number becomes 0
        while (number != 0) {

            // Extract last digit using modulus operator
            int digit = number % 10;

            // Append digit to reversed number
            reversed = reversed * 10 + digit;

            // Remove last digit from number
            number = number / 10;
        }

        // Compare reversed number with original number
        if (originalNumber == reversed) {
            System.out.println(originalNumber + " is a Palindrome number.");
        } else {
            System.out.println(originalNumber + " is NOT a Palindrome number.");
        }

        // Close scanner to avoid memory leak
        scanner.close();
    }
}
