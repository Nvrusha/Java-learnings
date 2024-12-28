package Oct.Ex18_CollectionFramework.List.ArrayList;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {

        // Create an ArrayList without specifying a data type (raw type)
        // Note: Raw types are not type-safe and can lead to runtime errors.
        ArrayList studentsList = new ArrayList();

        // Adding elements to the ArrayList
        studentsList.add("Sam");          // Add a String element
        studentsList.add("James");
        studentsList.add("Sam");          // Duplicate is allowed
        studentsList.add("Levi");
        studentsList.add("Jiraya");
        studentsList.add(true);            // Add a Boolean value
        studentsList.add(8);               // Add an Integer value

        // Print the entire list
        System.out.println("Student List: " + studentsList);

        // Display the size of the list
        System.out.println("Size of the list: " + studentsList.size());

        // Check if the list is empty
        System.out.println("Is the list empty? " + studentsList.isEmpty());

        // Check if a specific element exists in the list
        System.out.println("Does the list contain 'Levi'? " + studentsList.contains("Levi"));

        // Find the index of a specific element
        System.out.println("Index of the element '8': " + studentsList.indexOf(8));

        // Iterate through the list using for each loop and print each element
        System.out.println("Iterating through the list by for each loop:");
        for (Object student : studentsList) {
            System.out.println(student);
        }

        // Iterate through the list by for loop and print each element
        System.out.println("Iterating through the list by for loop:");
        for (int i = 0; i < studentsList.size(); i++) {
            System.out.println(studentsList.get(i));
        }

        // Remove an element by value
        studentsList.remove("Sam"); // Removes the first occurrence of "Sam"
        System.out.println("List after removing 'Sam': " + studentsList);

        // Remove an element by index
        studentsList.remove(4); // Removes the element at index 4
        System.out.println("List after removing the element at index 4: " + studentsList);

        // Clear all elements from the list
        studentsList.clear();
        System.out.println("List after clearing all elements: " + studentsList);
    }
}
