package Oct.Practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex17_Take_Input_FromUser {
    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        int age = 0; // Variable to store age
        boolean validInput = false; // Flag to track if the input is valid

        /*
         * Keep asking the user until a valid input is provided
         * The loop will run while validInput is false
         * The ! operator flips validInput (NOT false = true), so the loop runs
         */
        while (!validInput) {
            try {
                System.out.print("Please enter your age: ");
                age = sc.nextInt(); // Try to read an integer

                if (age <= 0) {
                    // Age should be positive; if not, display error and continue loop
                    System.out.println("❌ Invalid input! Age must be a positive number.\n");
                } else {
                    // Valid age entered; set flag to true to exit the loop
                    validInput = true;
                }
            }
            catch (InputMismatchException e) {
                /*
                 * Handles non-numeric input (e.g., letters or symbols)
                 * nextInt() will throw InputMismatchException if input is not an integer
                 * sc.nextLine() is used here to **clear the invalid input from the buffer**
                 * Without sc.nextLine(), the invalid input remains in the Scanner,
                 * which could cause an infinite loop
                 */
                System.out.println("⚠️  Please enter a valid numeric value for age.\n");
                sc.nextLine(); // Clear invalid input from buffer
            }
        }

        // Display a message based on the user's age
        if (age < 16) {
            System.out.println("🚫 Too young to drive! Stick to bicycles and avoid crashing your homework.");
        } else if (age >= 16 && age < 18) {
            System.out.println("🛵 You can get a learner’s license. Time to impress your friends without scaring your parents!");
        } else if (age >= 18 && age < 60) {
            System.out.println("🚗 You're cleared to drive! Remember: coffee in the morning, brakes in the evening.");
        } else if (age >= 60 && age <= 100) {
            System.out.println("🚙 You can drive, but maybe consider cruise control… or a scooter for style points!");
        } else {
            System.out.println("⚠️  Hmm… are you secretly a time traveler? Check your age again!");
        }

        // Ask user if they want to check another age
        System.out.print("\nDo you want to check another age? (yes/no): ");
        sc.nextLine(); // Consume the leftover newline from previous nextInt() input
        String response = sc.nextLine(); // Read the actual user response

        /*
         * If the user wants to check again, we call main(null) recursively.
         * main(null) simply restarts the program from the beginning.
         * Passing null is fine because we do not use the args array in this program.
         * Note: Recursion can be risky if used too many times; in real-world programs,
         * a loop-based approach is safer.
         */
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("\nRestarting the program...\n");
            main(null); // recursively restart the program
        } else {
            System.out.println("✅ Thank you for using the driving eligibility checker!");
        }

        // Close the Scanner to prevent resource leaks
        sc.close();
    }
}
