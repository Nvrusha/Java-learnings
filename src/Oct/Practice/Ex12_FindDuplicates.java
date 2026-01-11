package Oct.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex12_FindDuplicates {
    public static void main(String[] args) {
        // Given array with some duplicate numbers
        int[] array = {1, 5, 7, 23, 7, 3, 2, 8, 3, 5};

        // List to store unique elements
        List<Integer> uniqueList = new ArrayList<>();

        // Counter to count how many duplicate elements occur
        int countDuplicates = 0;

        // Loop through each number in the array
        for (int num : array) {

            // If the number already exists in the list → duplicate found
            if (uniqueList.contains(num)) {

                // Increase duplicate count
                countDuplicates++;

            } else {
                // If number NOT in the list → add it to the list
                uniqueList.add(num);
            }
        }

        // Print the number of duplicates found
        System.out.println("Total duplicates found: " + countDuplicates);
    }
}
