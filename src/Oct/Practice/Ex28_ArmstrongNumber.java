package Oct.Practice;

import java.util.Scanner;

public class Ex28_ArmstrongNumber {
    public static void main(String[] args) {

        // Create Scanner object to read input from console
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();   // Store user input

        // Store original number for comparison later
        int originalNumber = number;

        // Variable to store sum of powered digits
        int sum = 0;

        // Variable to count total number of digits
        int digits = 0;

        // Temporary variable to manipulate the number
        int temp = number;

        // -------- Step 1: Count total digits --------
        while (temp != 0) {
            digits++;          // Increase digit count
            temp = temp / 10;  // Remove last digit
        }

        // Reset temp to original number for second loop
        temp = number;

        // -------- Step 2: Calculate sum of digit^digits --------
        while (temp != 0) {

            int digit = temp % 10;  // Extract last digit

            int power = 1;          // Store digit raised to power

            // Calculate digit^digits manually
            for (int i = 1; i <= digits; i++) {
                power = power * digit;
            }

            sum = sum + power;  // Add to total sum

            temp = temp / 10;   // Remove last digit
        }

        // -------- Step 3: Compare sum with original number --------
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong number.");
        }

        // Close scanner to prevent memory leak
        scanner.close();
    }
}
