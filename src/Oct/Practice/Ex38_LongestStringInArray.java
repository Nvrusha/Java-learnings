package Oct.Practice;
/**
 * Interview Answer:
 * To find the largest string in an array, I iterate through each element
 * and compare its length with the current maximum length string.
 * If a longer string is found, I update the reference.
 * This approach has a time complexity of O(n) and uses constant space.
 */
public class Ex38_LongestStringInArray {
    public static void main(String[] args) {

        // Input array of strings
        String[] arr = {"James", "Christopher", "Amy", "Jonathan"};

        // Assume the first string is the largest initially
        String largest = arr[0];

        // Traverse through each string in the array
        for (String str : arr) {

            // Compare lengths of current string and largest string
            if (str.length() > largest.length()) {

                // Update largest if current string is longer
                largest = str;
            }
        }

        // Print the result
        System.out.println("Largest string: " + largest);
    }
}
