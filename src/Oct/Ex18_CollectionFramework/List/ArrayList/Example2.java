package Oct.Ex18_CollectionFramework.List.ArrayList;

import java.util.ArrayList;

public class Example2 {
    public static void main(String[] args) {

        // Create an ArrayList with a generic type of String
        // This means the ArrayList will only store elements of type String
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Get and print the element at index 1
        System.out.println(list.get(1)); // Output: Banana

        // Remove the element at index 0
        list.remove(0);

        // Iterate through the list and print each element
        for (String fruit : list) {
            System.out.println(fruit); // Output: Banana, Cherry
        }
    }
}
