package Oct.Practice;

import java.util.Arrays;

/*
 ============================================================
 🎯 PROBLEM:
 Sort the given array based on the second digit (units place)
 of each number.

 Example:
 Input  : {12, 34, 16, 98, 21, 15}
 Units  :  2   4   6   8   1   5
 Output : {21, 12, 34, 15, 16, 98}

 ============================================================
 💡 APPROACH:
 1. Use Integer[] instead of int[] because custom Comparator
    works only with object types.
 2. Use Arrays.sort() with a lambda expression.
 3. Extract units digit using modulus operator (num % 10).
 4. Compare extracted digits to determine order.

 Time Complexity  : O(n log n)
 Space Complexity : O(1) (ignoring sorting internals)

 ============================================================
 🗣 INTERVIEW TIP (How to Explain Verbally):

 "I am using a custom Comparator with Arrays.sort().
  Instead of sorting by full number, I extract the units digit
  using modulus operator. Then I compare those digits using
  Integer.compare() to avoid overflow issues.
  This keeps the solution clean, efficient, and scalable."

 ============================================================
*/

public class Ex36_SortBySecondDigit {

    public static void main(String[] args) {

        // Using Integer[] instead of int[] to allow custom comparator
        Integer[] arr = {12, 34, 16, 98, 21, 15};

        /*
         Custom Comparator Logic:

         (a % 10) → Extracts last digit of number 'a'
         (b % 10) → Extracts last digit of number 'b'

         Comparator returns:
         - Negative → a comes before b
         - Zero     → equal
         - Positive → b comes before a

         Using Integer.compare() is safer than subtraction
         to avoid potential integer overflow.
        */

        Arrays.sort(arr, (a, b) -> Integer.compare(a % 10, b % 10));

        // Printing sorted array
        System.out.println(Arrays.toString(arr));
    }
}
