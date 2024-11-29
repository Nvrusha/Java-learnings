package Oct.Ex14_OOPS.Polymorphism.MethodOverriding;

public class Lab039 {
    public static void main(String[] args) {
        //Definition:
        //This occurs when a subclass provides a specific implementation for a method already defined
        //in its superclass. The method to be invoked is determined at runtime based on the object's type.

        Animal myAnimal; // Reference of parent class

        myAnimal = new Dog();
        myAnimal.sound(); // Outputs: Dog barks

        myAnimal = new Cat();
        myAnimal.sound(); // Outputs: Cat meows
    }
}
//1.The method in the subclass must have the same name, return type, and parameters as the method in the superclass.
//2.The subclass method overrides the superclass method.

class Animal {
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}