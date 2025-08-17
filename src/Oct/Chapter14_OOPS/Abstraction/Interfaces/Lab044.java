package Oct.Chapter14_OOPS.Abstraction.Interfaces;

public class Lab044 {
    public static void main(String[] args) {

        // Create objects of Dog and Cat
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Call methods
        dog.sound(); // Output: Dog barks.
        dog.eat();   // Output: Dog eats bones.

        cat.sound(); // Output: Cat meows.
        cat.eat();   // Output: Cat eats fish.;

    }

}

// Define the interface
interface Animal {
    void sound(); // Abstract method
    void eat();   // Abstract method
}

// Implement the interface
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats bones.");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows.");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats fish.");
    }
}