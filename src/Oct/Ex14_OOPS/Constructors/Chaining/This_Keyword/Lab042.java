package Oct.Ex14_OOPS.Constructors.Chaining.This_Keyword;

public class Lab042 {
    public static void main(String[] args) {
        Example obj = new Example(); // Triggers constructor chaining
        obj.display(); // Displays the values of a and b
    }
}

class Example {
    private int a, b;

    // Constructor 1: Default constructor
    public Example() {
        this(10, 20); // Calls the parameterized constructor within the same class
        System.out.println("Default Constructor is called");
    }

    // Constructor 2: Parameterized constructor
    public Example(int a, int b) {
        this.a = a; // Assign values to instance variables
        this.b = b;
        System.out.println("Parameterized Constructor is called");
    }

    public void display() {
        System.out.println("a = " + a + ", b = " + b);
    }
}