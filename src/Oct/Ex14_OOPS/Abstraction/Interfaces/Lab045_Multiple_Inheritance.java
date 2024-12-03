package Oct.Ex14_OOPS.Abstraction.Interfaces;

// Main class to test the functionality
public class Lab045_Multiple_Inheritance {
    public static void main(String[] args) {
        Bat bat = new Bat();

        // Calling methods from both interfaces
        bat.eat();
        bat.fly();

    }
}

// Defining the first interface
interface Mammal {
    void eat(); // Abstract method
}

// Defining the second interface
interface Bird {
    void fly(); // Abstract method
}

// A class implementing multiple interfaces
class Bat implements Mammal, Bird {
    @Override
    public void eat() {
        System.out.println("The bat is eating insects.");
    }

    @Override
    public void fly() {
        System.out.println("The bat is flying at night.");
    }
}