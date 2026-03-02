package Oct.Practice;

/*
 🎯 HOW TO EXPLAIN IN INTERVIEW

 "To solve the Two Sum problem using a brute-force approach,
  I use two nested loops.
  The outer loop selects one element,
  and the inner loop checks all remaining elements
  to see if their sum equals the target.

  I start the inner loop from i + 1 to:
  1️⃣ Avoid comparing the same element with itself
  2️⃣ Avoid duplicate pair checking

  This guarantees that every unique pair is checked exactly once.

  Time Complexity: O(n²)
  Space Complexity: O(1)
*/

public class Ex35_TwoSum {

    public static void main(String[] args) {

        // ------------------ INPUT ------------------

        int[] arr = {1, 2, 3, 7, 8, 11};   // Input array
        int target = 9;                    // Target sum

        // ------------------ STEP 1: CHECK ALL UNIQUE PAIRS ------------------

        // Outer loop selects the first element of the pair
        for (int i = 0; i < arr.length; i++) {

            // Inner loop selects the second element
            // Starts from i + 1 to avoid:
            // 1️⃣ Self comparison (arr[i] + arr[i])
            // 2️⃣ Duplicate pairs like (2,7) and (7,2)
            for (int j = i + 1; j < arr.length; j++) {

                // ------------------ STEP 2: CHECK SUM ------------------

                // If sum of two elements equals target
                if (arr[i] + arr[j] == target) {

                    // Print the pair
                    System.out.println("Pair found: " + arr[i] + " + " + arr[j]);

                    // If only one pair is required, we could use:
                    // return;
                }
            }
        }
    }
}