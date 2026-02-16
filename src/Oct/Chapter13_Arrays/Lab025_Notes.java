package Oct.Chapter13_Arrays;

import java.util.Arrays;

public class Lab025_Notes {
    public static void main(String[] args) {

        /*
         ===========================================================
                         JAVA ARRAYS – INTERVIEW REVISION NOTES
         ===========================================================


         📌 1) WHAT IS AN ARRAY?
         -----------------------------------------------------------
         Array is a collection of elements of SAME data type stored
         in contiguous memory locations.

         • Fixed size (cannot grow/shrink)
         • Index based (starts from 0)
         • Faster access using index

         Interview Definition:
         "Array is a fixed-size data structure that stores homogeneous elements
         in continuous memory and provides constant-time access using index."


         📌 2) ARRAY MEMORY BEHAVIOR
         -----------------------------------------------------------
         Array object stored in HEAP
         Reference stored in STACK

         Example:
         int[] arr = new int[5];

         Default values:
         int → 0
         double → 0.0
         boolean → false
         char → '\u0000'
         object → null


         📌 3) TYPES OF ARRAYS
         -----------------------------------------------------------
         1D Array      → int[]
         2D Array      → int[][]
         Jagged Array  → rows of different sizes

         Interview:
         Difference between 2D and Jagged array


         📌 4) IMPORTANT ARRAY PROPERTY
         -----------------------------------------------------------
         arr.length  → gives size of array

         NOTE:
         length is a PROPERTY, not method
         (String uses length(), array uses length)


         📌 5) ARRAY CLASS (java.util.Arrays)
         -----------------------------------------------------------

         sort()              → sorting
         binarySearch()      → searching (sorted array only)
         equals()            → compare arrays
         fill()              → fill same value
         copyOf()            → copy array
         copyOfRange()       → partial copy
         toString()          → print array
         deepToString()      → print 2D array


         📌 6) SORTING
         -----------------------------------------------------------
         Arrays.sort(arr)

         Internally:
         primitives → Dual Pivot QuickSort
         objects → TimSort

         Time Complexity:
         O(n log n)


         📌 7) BINARY SEARCH
         -----------------------------------------------------------
         Works ONLY on sorted arrays

         Returns index if found
         Else → negative insertion point

         Time Complexity:
         O(log n)

         Interview Trap:
         Always sort before binarySearch


         📌 8) ARRAY VS ARRAYLIST
         -----------------------------------------------------------
         Array
         • Fixed size
         • Faster
         • Stores primitives

         ArrayList
         • Dynamic size
         • Slower
         • Stores objects only

         Interview Question:
         When to prefer array over ArrayList?


         📌 9) PASSING ARRAY TO METHOD
         -----------------------------------------------------------
         Array is passed as reference (but Java still pass-by-value)

         So:
         Changes inside method affect original array


         📌 10) CLONE VS COPY
         -----------------------------------------------------------
         clone() → shallow copy
         Arrays.copyOf() → new independent array

         Interview Favorite:
         Difference between deep copy and shallow copy


         📌 11) COMMON INTERVIEW PROGRAMS
         -----------------------------------------------------------
         • Reverse array
         • Find max/min
         • Second largest element
         • Remove duplicates
         • Rotate array
         • Merge arrays
         • Frequency count
         • Missing number


         📌 12) TIME COMPLEXITY
         -----------------------------------------------------------
         Access element → O(1)
         Search element → O(n)
         Binary search → O(log n)
         Insert middle → O(n)
         Delete middle → O(n)


         📌 13) MULTIDIMENSIONAL ARRAY MEMORY
         -----------------------------------------------------------
         Stored as array of arrays

         int[][] arr = new int[3][];
         Each row separate object

         Called Jagged Array


         📌 14) IMPORTANT INTERVIEW QUESTIONS
         -----------------------------------------------------------
         Q: Difference length vs length()?
         A: array uses length, string uses length()

         Q: Can array size change?
         A: No (fixed after creation)

         Q: Where array stored?
         A: Heap memory

         Q: Why arrays faster?
         A: Direct index access (O(1))

         Q: Why binary search faster?
         A: Divides search space in half


         📌 FINAL INTERVIEW ONE-LINER
         -----------------------------------------------------------
         "Array is a fixed-size contiguous memory data structure
         providing O(1) access, and Arrays class provides utility
         methods like sort and binarySearch."

         ===========================================================
         END OF ARRAY REVISION
         ===========================================================
        */


    }
}
