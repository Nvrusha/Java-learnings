package Oct.Practice;
/*
============================================================
🟢 Interview Preparation Question
------------------------------------------------------------
Problem:
Find the largest and second largest distinct elements
in an integer array without sorting.

Approach:
- Traverse the array once (single pass).
- Maintain two variables: largest and secondLargest.
- Update them dynamically during traversal.
- Handle edge cases like:
    • Array size less than 2
    • All elements same
    • Negative numbers

Time Complexity: O(n)
Space Complexity: O(1)

Why this approach?
Because sorting takes O(n log n), but this approach
solves it in O(n) time using constant space.
============================================================
*/
public class Ex34_SecondLargest {
    public static void main(String[] args) {
        // Sample input array
        int[] arr = {10, 5, 20, 8, 20};

        // Edge case: if array has less than 2 elements
        if (arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return; // Exit program
        }

        // Initialize largest and secondLargest
        // with smallest possible integer value
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse the array using enhanced for loop
        for (int num : arr) {

            // If current number is greater than largest
            if (num > largest) {

                // Current largest becomes secondLargest
                secondLargest = largest;

                // Update largest
                largest = num;
            }

            // If current number is smaller than largest
            // but greater than secondLargest
            // AND ensure it is not equal to largest
            else if (num > secondLargest && num != largest) {

                // Update secondLargest
                secondLargest = num;
            }
        }

        // If secondLargest is still MIN_VALUE,
        // it means no valid second largest was found
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No distinct second largest element found.");
        }
        else {
            // Print results
            System.out.println("Largest Element: " + largest);
            System.out.println("Second Largest Element: " + secondLargest);
        }
    }
}
