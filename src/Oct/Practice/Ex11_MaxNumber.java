package Oct.Practice;

public class Ex11_MaxNumber {
    public static void main(String[] args) {
        // Find maximum number in an array

        int [] array = {130,7,4,90,23,54,23,89,110};

        // Initialize max to the first element of the array
        int max = array[0];

        // Loop through the array to find the maximum
        for (int i = 0; i < array.length; i++ ){
            if(array[i] > max){
                max = array[i];  // Update max if current element is greater
            }
        }

        // Print the maximum value found
        System.out.println(max);
    }
}
