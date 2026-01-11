package Oct.Practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class Ex23_RemoveDuplicates_Array {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 10, 40, 30};

        // Using LinkedHashSet to maintain order
        Set<Integer> uniqueSet = new LinkedHashSet<>();

        // Add elements to set (duplicates will be removed automatically)
        for(int num : arr) {
            uniqueSet.add(num);
        }

        // Print unique elements
        System.out.println("Array after removing duplicates: " + uniqueSet);

        // Logic:
        // 1. Set interface does not allow duplicate elements.
        // 2. When we add array elements to Set, duplicates are automatically removed.
        // 3. LinkedHashSet is used to maintain insertion order.
    }
}
