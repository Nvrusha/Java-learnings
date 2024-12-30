package Oct.Ex18_CollectionFramework.Map;

import java.util.HashMap;

public class HashMap_Ex {
    public static void main(String[] args) {

        // Create a HashMap to store student records
        HashMap<Integer, String> studentRecords = new HashMap<>();

        // Adding students to the record using put() method
        studentRecords.put(101, "Alice");
        studentRecords.put(102, "Bob");
        studentRecords.put(103, "Charlie");

        // Display all student records
        System.out.println("All Student Records: " + studentRecords);

        // Retrieve a student's name using their ID (get() method)
        int studentID = 102;
        System.out.println("Student with ID " + studentID + ": " + studentRecords.get(studentID));

        // Check if a particular ID exists (containsKey() method)
        int checkID = 104;
        if (studentRecords.containsKey(checkID)) {
            System.out.println("Student ID " + checkID + " exists in the record.");
        } else {
            System.out.println("Student ID " + checkID + " does not exist in the record.");
        }

        // Check if a particular name exists (containsValue() method)
        String checkName = "Alice";
        if (studentRecords.containsValue(checkName)) {
            System.out.println("Student name " + checkName + " exists in the record.");
        } else {
            System.out.println("Student name " + checkName + " does not exist in the record.");
        }

        // Remove a student record using remove() method
        int removeID = 103;
        String removedStudent = studentRecords.remove(removeID);
        System.out.println("Removed Student with ID " + removeID + ": " + removedStudent);

        // Display the size of the HashMap (size() method)
        System.out.println("Number of students after removal: " + studentRecords.size());

        // Iterate through the HashMap (keySet() and values() methods)
        System.out.println("\nIterating through student records:");
        for (Integer ID : studentRecords.keySet()){
            System.out.println("ID: " + ID + ", Name: " + studentRecords.get(ID));
        }

        // Clear all student records (clear() method)
        studentRecords.clear();
        System.out.println("\nStudent Records after clearing: " + studentRecords);
        System.out.println("Is the record empty? " + studentRecords.isEmpty());

    }
}
