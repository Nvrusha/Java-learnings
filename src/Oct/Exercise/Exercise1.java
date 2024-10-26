package Oct.Exercise;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

     // write a program to calculate percentage of a given student in CBSE board exam. His marks for
     // 5 subjects must be taken as input from keyboard

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for English(100):");
        int English = scanner.nextInt();

        System.out.println("Enter marks for Maths(100):");
        int Maths = scanner.nextInt();

        System.out.println("Enter marks for Physics(100):");
        int Physics = scanner.nextInt();

        System.out.println("Enter marks for Hindi(100):");
        int Hindi = scanner.nextInt();

        System.out.println("Enter marks for Chemistry(100):");
        int Chemistry = scanner.nextInt();

        int total_marks = English + Physics + Maths + Chemistry + Hindi;
        double res = (total_marks / 500.0) * 100;
        System.out.println(res);


    }
}
