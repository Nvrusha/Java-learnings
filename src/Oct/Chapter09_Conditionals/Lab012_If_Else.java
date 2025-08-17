package Oct.Chapter09_Conditionals;

import java.util.Scanner;

public class Lab012_If_Else {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        if (age > 18){
            System.out.println("You can drive!");
        }
        else {
            System.out.println("You can't drive!");
        }

        scanner.close();

    }
}
