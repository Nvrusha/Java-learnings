package Java.Practice;

import java.util.Scanner;

public class Ex10_Arithmetic_Functions {
    public static void main(String[] args) {
        // Basic arithmetic operations using function

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();

        //Function calling
        System.out.println("Addition is: " + Addition(a,b));
        System.out.println("Subtraction is: " + Subtraction(a,b));
        System.out.println("Multiplication is: " + Multiplication(a,b));

        // Division with zero check
        if (b != 0) {
            System.out.println("Division is: " + Division(a, b));
        } else {
            System.out.println("Division by zero is undefined.");
        }

        scanner.close();

    }
    // Function for addition
    static int Addition(int a, int b){
        return a + b;
    }

    // Function for Subtraction
    static int Subtraction(int a, int b){
        return a - b;
    }

    // Function for Multiply
    static int Multiplication(int a, int b){
        return a * b;
    }

    // Function for Division
    static int Division(int a, int b){
        return a / b;
    }
}
