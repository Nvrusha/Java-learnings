package Oct.Chapter18_CollectionFramework.List.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Inputs {
    public static void main(String[] args) {

        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Create ArrayLists to store names and ages
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        // Initialize control variable for user input loop
        String continueInput = "Y";

        // Loop to get user input until they choose to stop
        while (continueInput.equalsIgnoreCase("Y")) {

            // Get and store name
            System.out.print("Enter name: ");
            String name = scanner.next();
            names.add(name);

            // Get and store age
            System.out.print("Enter age: ");
            while (!scanner.hasNextInt()) { // Validate age input
                System.out.println("Invalid input. Please enter a valid age.");
                scanner.next();
            }
            Integer age = scanner.nextInt();
            ages.add(age);

            // Ask if the user wants to continue
            scanner.nextLine(); // Consume newline left after nextInt
            System.out.print("Do you want to add another record? (Y/N): ");
            continueInput = scanner.nextLine();
        }

        // Display collected data
        System.out.println("Names: " + names);
        System.out.println("Ages: " + ages);

        // Close the Scanner
        scanner.close();
    }
}
