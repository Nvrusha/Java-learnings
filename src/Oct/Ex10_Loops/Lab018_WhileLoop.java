package Oct.Ex10_Loops;

import java.util.Scanner;

public class Lab018_WhileLoop {
    public static void main(String[] args) {
        // Take age from user and print it in reverse;

        // Method 1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        for (int i = age; i > 0; i--) {
            System.out.println(i);
        }

        scanner.close();

        System.out.println();

        // Method 2
        String argument = args[0];
        int age1 = Integer.parseInt(argument);

        while (age1 > 0) {
            System.out.println(age1);
            age1--;
        }

    }
}
