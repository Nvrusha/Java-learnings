package Oct.Ex17_Generics;

public class GenericMethod {

    // A Generic Method that can print arrays of any type
    public static <T> void printArray(T[] array){
        // Loop through each element in the array
        // Print each element followed by a space
        for (T item : array) {
            System.out.println(item + " ");
        }
    }

    public static void main(String[] args) {
        // Define an Integer array
        Integer[] intArray = {1,2,3};

        // Define a String array
        String[] strArray = {"A", "B","C"};

        // Call the generic method with an Integer array
        printArray(intArray);  // Output: 1 2 3

        // Call the generic method with a String array
        printArray(strArray);  // Output: A B C

    }
}

