package Oct.Practice;


public class Ex16_Reverse_Array {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};  // Original array
        int start = 0;                     // Pointer at start
        int end = arr.length - 1;          // Pointer at end

        // Loop runs until start crosses end
        while(start < end) {

            // Swap elements at start and end indexes
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move pointers
            start++;   // move forward
            end--;     // move backward
        }

        // Print reversed array
        System.out.println("Reversed Array:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
