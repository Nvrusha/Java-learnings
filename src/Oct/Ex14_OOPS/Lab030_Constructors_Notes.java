package Oct.Ex14_OOPS;

public class Lab030_Constructors_Notes {
    public static void main(String[] args) {
        //Purpose: Constructors initialize new objects and set initial values for fields.
        //Name: A constructor’s name must match the class name.
        //No Return Type: Constructors do not have a return type (not even void).

        //Types of Constructors:

        //Default Constructor: No-argument constructor provided by the compiler if no other constructor
        //is defined.

        //Parameterized Constructor: Accepts parameters to initialize fields with specific values.

        //Automatic Default Constructor:

        //Created by the compiler if no constructors are defined in the class.
        //Initializes fields with default values (e.g., 0 for integers, null for objects).
        //Custom Default Constructor: Can be defined explicitly to set default values.

        //Usage: new ClassName() calls the default or parameterized constructor to create an object.

        //Overloading: Multiple constructors can be defined with different parameter lists (constructor overloading).

        //Inheritance:

        //Constructors are not inherited.
        //A subclass calls a superclass constructor explicitly or automatically (using super()).
        //Constructor Chaining:

        //Calls from one constructor to another within the same class using this().
        //Calls superclass constructor using super().
        //Access Modifiers: Constructors can use public, protected, default, or private access modifiers.

        //Special Uses:

        //Frameworks and libraries often require a no-argument (default) constructor.
        //Private constructors are used in singleton design patterns to restrict instantiation.
    }
}
