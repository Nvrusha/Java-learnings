package Oct.Chapter18_CollectionFramework.List.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Example {
    public static void main(String[] args) {
        // Create a LinkedList to store tasks
        LinkedList toDoList = new LinkedList();

        // Add tasks to the list
        toDoList.add("Complete homework");
        toDoList.add("Go grocery shopping");
        toDoList.add("Clean the house");

        // Print the to-do list
        System.out.println("To-Do List: " + toDoList);
        System.out.println();

        // Add a task at the beginning
        toDoList.addFirst("Morning exercise");

        // Add a task at the end
        toDoList.addLast("Read a book");

        // Print the updated to-do list
        System.out.println("Updated To-Do List: " + toDoList);
        System.out.println();

        // Remove a task from the list
        toDoList.remove("Clean the house");

        // Print the to-do list after removal
        System.out.println("After Removal: " + toDoList);
        System.out.println();

        // Access and print the first task
        System.out.println("First Task: " + toDoList.getFirst());
        System.out.println();

        // Access and print the last task
        System.out.println("Last Task: " + toDoList.getLast());

        // Iterate through the list using for each loop and print each element
        System.out.println("Iterating through the list by for each loop:");
        for (Object student : toDoList) {
            System.out.println(student);
        }
        System.out.println();

        // Iterate through the list by for loop and print each element
        System.out.println("Iterating through the list by for loop:");
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println(toDoList.get(i));
        }
        System.out.println();

        //Iterate through the list by using iterator.
        System.out.println("Iterating through the list by using Iterator");
        Iterator iterator = toDoList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
