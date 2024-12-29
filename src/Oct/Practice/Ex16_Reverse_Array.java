package Oct.Practice;


public class Ex16_Reverse_Array {
    public static void main(String[] args) {

        // Step 1: Initialize the array with predefined values
        int[] numbers = {1, 2, 3, 4, 5};

        // Step 2: Indicate the operation being performed
        System.out.print("Reversed Array:");

        // Step 3: Loop through the array in reverse order
        // Start from the last index and decrement until the first index
        for (int i = numbers.length - 1; i >= 0; i--) {
            // Print each element separated by a space
            System.out.print(" " + numbers[i]);
        }

    }
}
