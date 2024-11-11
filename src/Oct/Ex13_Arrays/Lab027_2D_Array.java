package Oct.Ex13_Arrays;

import java.util.Arrays;

public class Lab027_2D_Array {
    public static void main(String[] args) {
        // Declare and initialize a 2D array with 3 rows and 3 columns
        int [][] array = new int[3][3];

        // Assign values to the first row
        array[0][0] = 90;
        array[0][1] = 91;
        array[0][2] = 92;

        // Assign values to the second row
        array[1][0] = 80;
        array[1][1] = 81;
        array[1][2] = 82;

        // Assign values to the third row
        array[2][0] = 70;
        array[2][1] = 71;
        array[2][2] = 72;

        // Print the 2D array using Arrays.deepToString to display it in a readable format
        System.out.println(Arrays.deepToString(array));

        // Declare and initialize a 2D array with 2 rows and 3 columns
        int [][] array1 = new int[2][3];

        // Assign values to the first row
        array1[0][0] = 1;
        array1[0][1] = 2;
        array1[0][2] = 3;

        // Assign values to the second row
        array1[1][0] = 4;
        array1[1][1] = 5;
        array1[1][2] = 6;

        // Print the 2D array using Arrays.deepToString to display it in a readable format
        System.out.println(Arrays.deepToString(array1));



    }
}
