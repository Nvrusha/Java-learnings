package Oct.Practice;

public class Ex24_SortArray {
    public static void main(String[] args) {
        int[] arr = {50, 10, 30, 20, 40};  // Original array

        // Outer loop runs for each element
        for(int i = 0; i < arr.length - 1; i++) {

            // Inner loop to compare current element with every next element
            for(int j = i + 1; j < arr.length; j++) {

                // If current element is greater than next, swap them
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print sorted array
        System.out.print("Sorted Array: ");
        for(int num : arr) {
            System.out.print(num + " ");

            // Logic:
            // 1️⃣ Use two loops to compare each element with all other elements.
            // 2️⃣ If arr[i] > arr[j] (wrong order), then swap them.
            // 3️⃣ By doing this repeatedly, smallest elements move to front.
            // 4️⃣ This is Selection Sort (basic sorting logic).
        }
    }
}
