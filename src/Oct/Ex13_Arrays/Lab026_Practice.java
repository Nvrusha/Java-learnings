package Oct.Ex13_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab026_Practice {
    public static void main(String[] args) {

        // Arrays.binarySearch(array, value)

        //Purpose: Searches for a specified value in a sorted array and returns its index,
        //or -1 if not found.

        //Note: The array must be sorted before calling binarySearch.

        int[] array = {102, 98, 34, 67, 5, 90, 23, 7, 8};

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array, 9));

        // Ask user to enter the array
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of an array: ");
        int length = scanner.nextInt();

        int[] array1 = new int[length];

        for (int i = 0; i < length; i++) {

            System.out.println("Enter the number " + (i+1));
            array1[i] = scanner.nextInt();
        }
        System.out.println("The entered array is: " + Arrays.toString(array1));
        scanner.close();

    }
}
