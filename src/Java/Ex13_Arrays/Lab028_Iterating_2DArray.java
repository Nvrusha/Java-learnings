package Java.Ex13_Arrays;

public class Lab028_Iterating_2DArray {
    public static void main(String[] args) {

        // Declare and initialize a 2D array with preset values
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};

        // Outer loop iterates over each row of the 2D array
        for (int i = 0; i < array.length; i++){
            // Inner loop iterates over each column in the current row
            for(int j = 0; j < array[i].length; j++){

                // Print the current element followed by a space
                System.out.print(array[i][j] + " ");
            }
            // Print a newline after each row is printed
            System.out.println();
        }
    }
}
