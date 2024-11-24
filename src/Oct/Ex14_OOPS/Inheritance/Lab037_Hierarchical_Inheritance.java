package Oct.Ex14_OOPS.Inheritance;

// Main class to demonstrate hierarchical inheritance
public class Lab037_Hierarchical_Inheritance {
    public static void main(String[] args) {

        // Creating an instance of the Father class
        Father f1 = new Father();
        f1.home(); // Calling the Father's method
        System.out.println();

        // Creating an instance of the Son1 class (eldest son)
        Son1 h1 = new Son1();
        h1.s1();    // Calling Son1's specific method
        h1.home();  // Calling the inherited method from Father
        System.out.println();

        // Creating an instance of the Son2 class (middle son)
        Son2 h2 = new Son2();
        h2.s2();    // Calling Son2's specific method
        h2.home();  // Calling the inherited method from Father
        System.out.println();

        // Creating an instance of the Son3 class (youngest son)
        Son3 h3 = new Son3();
        h3.s3();    // Calling Son3's specific method
        h3.home();  // Calling the inherited method from Father
    }
}

// Base class: Father
class Father {
    // Method to represent Father's home details
    void home() {
        System.out.println("Father's house: 4 BHK");
    }
}

// Derived class: Son1 inherits from Father
class Son1 extends Father {
    // Method specific to Son1
    void s1() {
        System.out.println("Eldest son's house: 3 BHK");
    }
}

// Derived class: Son2 inherits from Father
class Son2 extends Father {
    // Method specific to Son2
    void s2() {
        System.out.println("Middle son's house: 2 BHK");
    }
}

// Derived class: Son3 inherits from Father
class Son3 extends Father {
    // Method specific to Son3
    void s3() {
        System.out.println("Younger son's house: 1 BHK");
    }
}