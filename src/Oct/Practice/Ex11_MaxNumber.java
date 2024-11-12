package Oct.Practice;

public class Ex11_MaxNumber {
    public static void main(String[] args) {
        // Find maximum number in an array

        int[] array = {130, 7, 4, 90, 23, 54, 23, 89, 110};

        // Call the max_Number method and store the result in max_value
        int max_value = max_Number(array);

        System.out.println("The maximum number is " + max_value);
    }

    // Method to find the maximum number in an array
    static int max_Number(int[] array) {
        // Initialize max to the first element of the array
        int max = array[0];

        for (int i = 1; i < array.length; i++) { // Start from index 1 as max is already array[0]
            if (array[i] > max) {
                max = array[i];  // Update max if current element is greater
            }
        }
        // Return the maximum value found
        return max;
    }
}
