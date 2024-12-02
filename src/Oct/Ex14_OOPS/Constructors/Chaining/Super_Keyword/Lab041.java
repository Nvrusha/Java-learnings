package Oct.Ex14_OOPS.Constructors.Chaining.Super_Keyword;

public class Lab041 {
    public static void main(String[] args) {
        B obj = new B(5); // Creates an object of class B using its parameterized constructor
    }
}

// Parent class A
class A {
    // Default constructor
    public A() {
        System.out.println("A is called"); // Default constructor of class A
    }

    // Parameterized constructor
    public A(int num) {
        System.out.println("A PC is called"); // Parameterized constructor of class A
    }
}

// Child class B extends parent class A
class B extends A {
    // Default constructor
    public B() {
        super(); // Explicitly calls the default constructor of class A
        System.out.println("B is called"); // Message indicating the default constructor of class B
    }

    // Parameterized constructor
    public B(int num) {
        super(num); // Explicitly calls the parameterized constructor of class A
        System.out.println("B PC is called"); // Message indicating the parameterized constructor of class B
    }
}