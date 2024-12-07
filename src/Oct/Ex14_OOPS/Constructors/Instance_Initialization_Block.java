package Oct.Ex14_OOPS.Constructors;

public class Instance_Initialization_Block {
    public static void main(String[] args) {

        MyClass obj1 = new MyClass(); // IIB will execute before the constructor
        MyClass obj2 = new MyClass(); // IIB will execute again before this constructor

    }
}

class MyClass {

    {
        // This is an Instance Initialization Block (IIB)
        System.out.println("Instance Initialization Block executed");
    }

    // Constructor
    MyClass() {
        System.out.println("Constructor executed");
    }
}