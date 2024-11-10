package Oct.Ex13_Arrays;

import java.util.Arrays;

public class Lab026_Practice {
    public static void main(String[] args) {

        // Arrays.binarySearch(array, value)

        //Purpose: Searches for a specified value in a sorted array and returns its index,
        //or -1 if not found.

        //Note: The array must be sorted before calling binarySearch.

        int [] array = {102,98,34,67,5,90,23,7,8};

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array, 9));
    }
}
