package Oct.Chapter18_CollectionFramework.Map;

import java.util.Hashtable;

public class Hashtable_Ex {
    public static void main(String[] args) {

        // Create a Hashtable for customer records
        Hashtable<Integer, String> customerTable = new Hashtable<>();

        // Adding customer records
        customerTable.put(101, "Alice");
        customerTable.put(102, "Bob");
        customerTable.put(103, "Charlie");

        // Uncommenting the following lines will throw exceptions:
        // customerTable.put(null, "David"); // Throws NullPointerException
        // customerTable.put(104, null);    // Throws NullPointerException

        // Accessing a specific customer's record
        System.out.println("Customer with ID 101: " + customerTable.get(101)); // Output: Alice

        // Updating a customer's record
        customerTable.put(102, "Bob Jr.");
        System.out.println("Updated record for ID 102: " + customerTable.get(102)); // Output: Bob Jr.

        // Removing a customer record
        customerTable.remove(103);
        System.out.println("After removing ID 103, records: " + customerTable);

        // Iterating through all records
        System.out.println("\nIterating through all customer records:");
        for (Integer id : customerTable.keySet()) {
            System.out.println("Customer ID: " + id + ", Name: " + customerTable.get(id));
        }

        // Checking if a specific key exists
        System.out.println("\nDoes ID 101 exist? " + customerTable.containsKey(101)); // Output: true

        // Checking if a specific value exists
        System.out.println("Does customer Alice exist? " + customerTable.containsValue("Alice")); // Output: true

        // Printing the size of the table
        System.out.println("Total number of customers: " + customerTable.size()); // Output: 2

    }
}
