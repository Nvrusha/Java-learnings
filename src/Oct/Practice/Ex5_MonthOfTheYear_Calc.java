package Oct.Practice;

import java.util.Scanner;

public class Ex5_MonthOfTheYear_Calc {
    public static void main(String[] args) {
        //Write a program that takes an integer input (1-12) and prints the name of the
        //corresponding month using a switch statement.
        //Input  - 12
        //Out - Dec.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number(1-12) to get the month of the year:");
        int monthNumber = scanner.nextInt();

        String monthName;

        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                System.out.println("Invalid month number!");
        }
    }
}
