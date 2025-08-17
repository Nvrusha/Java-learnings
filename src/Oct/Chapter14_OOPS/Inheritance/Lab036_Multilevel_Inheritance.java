package Oct.Chapter14_OOPS.Inheritance;

public class Lab036_Multilevel_Inheritance {
    public static void main(String[] args) {
        //Multilevel Inheritance
        //A class inherits from another class, which is also a subclass of a parent class.

        Dog1 dog = new Dog1();
        dog.eat(); // From Animal
        dog.walk(); // From Mammal
        dog.bark(); // From Dog
    }
}

class Animal1 {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Mammal extends Animal1 {
    void walk() {
        System.out.println("Mammal walks.");
    }
}

class Dog1 extends Mammal {
    void bark() {
        System.out.println("Dog barks.");
    }
}