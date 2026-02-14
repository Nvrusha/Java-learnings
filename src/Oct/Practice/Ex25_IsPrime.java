package Oct.Practice;

import java.util.Scanner;

public class Ex25_IsPrime {
    public static void main(String[] args) {

        // Main method - entry point of the Java program

        System.out.println("Try programiz.pro");
        // Printing a message to the console

        Scanner sc = new Scanner(System.in);
        // Creating a Scanner object to read input from keyboard

        System.out.print("Enter a number: ");
        // Asking user to enter a number

        int num = sc.nextInt();
        // Reading integer input from user and storing it in variable 'num'

        boolean isPrime = true;
        // Declaring a boolean variable and assuming the number is prime initially

        if(num < 1){
            // Checking if number is less than 1
            // (Prime numbers must be greater than 1)

            isPrime = false;
            // If number is 0, 1, or negative, it is not prime
        }
        else{
            // If number is greater than or equal to 1,
            // check for divisibility

            for(int i = 2; i < num; i++){
                // Loop from 2 up to num-1
                // to check if any number divides 'num'

                if(num % i == 0){
                    // If remainder is 0, number is divisible

                    isPrime = false;
                    // So number is not prime
                }
            }
        }

        System.out.println(isPrime);
        // Printing true if prime, false if not prime
    }
}
