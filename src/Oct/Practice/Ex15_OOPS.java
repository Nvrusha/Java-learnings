package Oct.Practice;

// Step 1: Define the StudentATB class
class StudentATB {
    private String name; // Name of the student
    private int id;      // Unique ID for the student
    private String batch; // Batch information

    // Constructor to initialize the StudentATB object
    public StudentATB(String name, int id, String batch) {
        this.name = name;
        this.id = id;
        this.batch = batch;
    }

    // Step 2: Override the toString method to return a string representation of the object
    @Override
    public String toString() {
        return "StudentATB{ name='" + name + "', id=" + id + ", batch='" + batch + "' }";
    }
}

// Step 3: Create a main class to test the implementation
public class Ex15_OOPS {
    public static void main(String[] args) {

        // Step 4: Create StudentATB objects
        StudentATB s1 = new StudentATB("Alice", 101, "Batch A");
        StudentATB s2 = new StudentATB("Bob", 102, "Batch B");
        StudentATB s3 = new StudentATB("Charlie", 103, "Batch C");

        // Step 5: Store the students in an array
        StudentATB[] students = {s1, s2, s3};

        // Step 6: Loop through the array and print the details of each student
        System.out.println("ATB Students:");
        for (StudentATB student : students) {
            System.out.println(student); // This will call the overridden toString method
        }

    }
}

