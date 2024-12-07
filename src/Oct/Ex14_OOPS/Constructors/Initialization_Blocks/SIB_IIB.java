package Oct.Ex14_OOPS.Constructors.Initialization_Blocks;

public class SIB_IIB {
    public static void main(String[] args) {
        System.out.println("Main Method started");

        MyClass obj1 = new MyClass(); // IIB will execute before the constructor
        MyClass obj2 = new MyClass(); // IIB will execute again before this constructor

    }
}

class MyClass {

    // Static Initialization Block (SIB) - Executes only once, when the class is loaded into memory.
    static {
        System.out.println("Static Block executed - once");
    }

    {
        // Instance Initialization Block (IIB) - Executes every time an object of the class is created.
        System.out.println("Instance Initialization Block executed");
    }

    // Constructor
    MyClass() {
        System.out.println("Constructor executed");
    }
}