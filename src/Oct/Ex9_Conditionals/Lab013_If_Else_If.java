package Oct.Ex9_Conditionals;

import java.util.Scanner;

public class Lab013_If_Else_If {
    public static void main(String[] args) {
        // Write a program that calculates and displays the letter grade for a given numerical
        // score (e.g., A, B, C, D, or F) based on the following grading scale:

        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your marks to know your grade:");
        int Marks = scanner.nextInt();

        if (Marks >= 90 && Marks <= 100) {
            System.out.println("A");
        } else if (Marks >= 80 && Marks < 90) {
            System.out.println("B");
        }
        else if (Marks >= 70 && Marks < 80) {
            System.out.println("C");
        }
        else if (Marks >= 60 && Marks < 70) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
        scanner.close();
    }
}
