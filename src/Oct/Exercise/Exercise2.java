package Oct.Exercise;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        // Detect whether the number entered by the user is even or odd

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println("Given number is even!");
        }
        else {
            System.out.println("Given number is odd!");
        }

    }
}
