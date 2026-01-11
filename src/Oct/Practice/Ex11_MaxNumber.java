package Oct.Practice;

public class Ex11_MaxNumber {
    public static void main(String[] args) {

        // Step 1: Declare and initialize the array
        int[] array = {130, 7, 4, 90, 23, 54, 23, 89, 110};

        // Step 2: Assume the first element is the maximum
        int max = array[0];

        // Step 3: Loop through the array starting from index 1
        for (int i = 1; i < array.length; i++) {

            // Step 4: Compare each element with current max
            // If a larger value is found, update max
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Step 5: Print the maximum number
        System.out.println("The maximum number is " + max);
    }
}
