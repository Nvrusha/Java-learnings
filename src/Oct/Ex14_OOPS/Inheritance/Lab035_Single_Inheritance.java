package Oct.Ex14_OOPS.Inheritance;

public class Lab035_Single_Inheritance {
    public static void main(String[] args) {

        //Single Inheritance:
        //A class inherits from one superclass.

        Dog dog = new Dog();
        dog.eat(); // Inherited from Animal
        dog.bark(); // Defined in Dog
    }
}

class Animal{
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal{
    void bark() {
        System.out.println("Dog barks.");
    }
}