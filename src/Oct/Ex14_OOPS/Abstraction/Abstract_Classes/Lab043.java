package Oct.Ex14_OOPS.Abstraction.Abstract_Classes;

// Runner class to test the functionality
public class Lab043 {
    public static void main(String[] args) {
        // Creating an object of Dog using the Animal reference (polymorphism)
        Animal myDog = new Dog();

        // Calling the implemented abstract method
        myDog.makeSound();

        // Calling the inherited concrete method
        myDog.sleep();

    }
}

// Abstract class defining a blueprint for all animals
abstract class Animal {
    // Abstract method (must be implemented by subclasses)
    abstract void makeSound();

    // Concrete method (provides default implementation)
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass Dog that extends the abstract class Animal
class Dog extends Animal {

    // Providing implementation for the abstract method
    @Override
    void makeSound() {
        System.out.println("Bark!");
    }
}