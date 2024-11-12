package Oct.Ex13_Arrays;

import java.util.Arrays;

public class Lab025_Notes {
    public static void main(String[] args) {

        // Array methods

        //1. Using Arrays.toString()
        //For one-dimensional arrays, Arrays.toString() provides a simple way to print all elements.

        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array)); // Output: [1, 2, 3, 4, 5]

        //2. Using a for Loop
        //You can use a traditional for loop to print each element individually.

        int[] array1 = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array1[i] + " ");
        } // Output: 1 2 3 4 5

        //3. Using an Enhanced for Loop (for-each loop)
        //This loop is a simpler way to iterate over an array.

        int[] array2 = {1, 2, 3, 4, 5};
        for (int num : array2) {
            System.out.print(num + " ");
        }
        // Output: 1 2 3 4 5

        //4. Using Arrays.deepToString() for Multi-Dimensional Arrays
        //For multi-dimensional arrays, Arrays.deepToString() is useful because it can print
        //nested arrays as well.

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(matrix));
        // Output: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

        //5. Using Arrays.stream() with forEach (Java 8+)
        //If you prefer using streams, Arrays.stream() works well, especially if you want to add
        //filters or other operations.

        int[] array3 = {1, 2, 3, 4, 5};
        Arrays.stream(array3).forEach(num -> System.out.print(num + " "));
        // Output: 1 2 3 4 5

        //6. Using String.join() for String Arrays
        //For String arrays, you can use String.join() to print elements with a delimiter.

        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println(String.join(", ", names));
        // Output: Alice, Bob, Charlie


    }
}
