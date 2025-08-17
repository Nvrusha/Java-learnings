package Oct.Chapter04_Variable_Datatype.Types;

public class Instance_Variables {
    public static void main(String[] args) {

        //Declared inside a class but outside any method, constructor, or block.
        //Each instance (object) of the class has its own copy of the variable.
        //Scope: Accessible by all methods of the class, tied to an object.
        //Automatically initialized to default values (e.g., 0 for int, null for objects).
        //Memory: Stored in the heap, as part of the object.

        Info obj1 = new Info();
        obj1.age = 24; // Access instance variables via the object
        obj1.display();

    }
}

class Info{

    int age; // Instance variable

    void display() {
        System.out.println("Instance variable: " + age);
    }
}