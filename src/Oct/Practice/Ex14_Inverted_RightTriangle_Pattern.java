package Oct.Practice;

import java.util.Scanner;

public class Ex14_Inverted_RightTriangle_Pattern {
    public static void main(String[] args) {
        // Inverted Right-Angled Star Triangle Pattern

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows for the triangle
        System.out.println("Enter number of rows: ");
        int n = scanner.nextInt();  // Read and store the number of rows

        // Outer loop for each row of the inverted triangle
        for (int i = 0; i < n; i++) {

            // Inner loop to print stars in each row, starting with 'n' stars and decreasing by one each row
            for (int j = i; j < n; j++) {
                System.out.print("*");  // Print star without a newline
            }

            // Print a newline after each row to move to the next row
            System.out.println();
        }
    }

}
