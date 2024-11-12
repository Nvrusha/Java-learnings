package Oct.Practice;

import java.util.Scanner;

public class Ex6_Unit_conversion {
    public static void main(String[] args) {
        //Write a program that converts between different units (e.g., kilometers to miles,
        //Celsius to Fahrenheit) based on user selection using a switch statement.

        //Input:
        //Choice: 1
        //Kilometers: 5
        //Output: 5 kilometers is 3.106855 miles.

        //Input:
        //Choice: 2
        //Fahrenheit: 100
        //Output: 100°F is 37.77777777777778°C.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unit Conversion Menu:");
        System.out.println("1--> Kilometers to Miles");
        System.out.println("2--> Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.print("Enter kilometers: ");
                double km = scanner.nextDouble();
                double miles = km * 0.621371; // Conversion factor
                System.out.println(km + " kilometers is " + miles + " miles.");
                break;

            case 2:
                System.out.println("Enter Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                double celsius = (fahrenheit - 32) * 5/9; // Conversion factor
                System.out.println(fahrenheit + "°F is " + celsius + "°C.");
                break;

            default:
                System.out.println("Invalid choice! Please select 1 or 2.");
        }
        scanner.close();

    }
}
