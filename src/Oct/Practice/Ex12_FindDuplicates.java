package Oct.Practice;

import java.util.Arrays;

public class Ex12_FindDuplicates {
    public static void main(String[] args) {
        //Write a function to determine if there are any duplicates in an array.

        int [] array = {1,5,7,23,7,3,2,8,3,5};
        duplicate_count(array);
    }

    static int duplicate_count(int [] array){
        int countDuplicates = 0;

        // Step 1: Sort the array to bring duplicate elements together
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        // Step 2: Loop through the sorted array and count consecutive duplicates
        for (int i = 0; i < array.length-1; i++) {
            if(array[i+1] == array[i]){     // Check if the current element is the same as the next one
                countDuplicates++;
            }
        }
        // Step 3: Return the total count of duplicate occurrences
        return countDuplicates;
    }
}
