package Oct.Ex8_Taking_Input;

import java.util.Scanner;

public class Lab011_Scanner_class {
    public static void main(String[] args) {
        // creates a Scanner object to read input from the console.
        Scanner scanner = new Scanner(System.in);

        // Taking string input
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        // Taking integer input
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        // Taking a double input
        System.out.println("Enter your height: ");
        double height = scanner.nextDouble();

        System.out.println("Your Name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your height is: " + height);
    }
}
