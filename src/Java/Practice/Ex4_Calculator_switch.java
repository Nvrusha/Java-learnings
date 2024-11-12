package Java.Practice;

import java.util.Scanner;

public class Ex4_Calculator_switch {
    public static void main(String[] args) {

        //Create a simple calculator that performs addition, subtraction, multiplication,
        //and division, modulus based on user input using switch statements.
        //Inputs :   num 1, num 2, +
        //Output :  num1+num2 → print information.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 1:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter number 2:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the operator (+,-,*,/,%):");
        char operator = scanner.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println("Addition result is " + (num1 + num2));
                break;
            case '-':
                System.out.println("Subtraction result is " + (num1 - num2));
                break;
            case '*':
                System.out.println("Multiplication result is " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0){
                    System.out.println("Division result is " + (num1 / num2));
                }
                else {
                    System.out.println("Cannot divide by zero");
                }

                break;
            case '%':
                if (num2 != 0) {
                    System.out.println("Modulus result is " + (num1 % num2));
                } else {
                    System.out.println("Cannot perform modulus by zero");
                }
                break;
            default:
                System.out.println("Please enter correct operator");
        }

        scanner.close();

    }
}
