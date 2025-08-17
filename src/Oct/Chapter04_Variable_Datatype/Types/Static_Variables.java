package Oct.Chapter04_Variable_Datatype.Types;

public class Static_Variables {
    public static void main(String[] args) {

        //Declared using the static keyword.
        //Shared among all objects of the class (single copy maintained).
        //Can be accessed using the class name (e.g., ClassName.variableName).
        //Scope: Available throughout the class and shared across instances.
        //Automatically initialized to default values.
        //Memory: Stored in the method area of JVM.

        // Creating objects of the Counter class
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        // Accessing the static variable using the static method
        Counter.displayCount(); // Output: Total objects created: 3

    }
}

class Counter {
    // Static variable: Shared across all instances of the class
    static int count = 0;

    // Constructor: Increment the static variable whenever an object is created
    public Counter() {
        count++; // Increment the shared count
    }

    // Static method: Can directly access the static variable
    public static void displayCount() {
        System.out.println("Total objects created: " + count);
    }
}