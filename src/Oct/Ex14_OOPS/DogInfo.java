package Oct.Ex14_OOPS;

public class DogInfo {
    public static void main(String[] args) {

        // Creating 5 Dog objects
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();
        Dog dog5 = new Dog();

        //Setting attributes for dog1
        System.out.println("Dog1 information: ");
        dog1.name = "Rob";
        dog1.breed = "Golden Retriever";
        dog1.colour = "Golden";
        dog1.age = 3;
        dog1.dogInfo();
        System.out.println();

        // Setting attributes for dog2
        System.out.println("Dog2 information: ");
        dog2.name = "Bella";
        dog2.breed = "Labrador";
        dog2.colour = "Black";
        dog2.age = 2;
        dog2.dogInfo();
        System.out.println();


        // Setting attributes for dog3
        System.out.println("Dog3 information: ");
        dog3.name = "Charlie";
        dog3.breed = "Beagle";
        dog3.colour = "Brown";
        dog3.age = 4;
        dog3.dogInfo();
        System.out.println();

        // Setting attributes for dog4
        System.out.println("Dog4 information: ");
        dog4.name = "Lucy";
        dog4.breed = "Poodle";
        dog4.colour = "White";
        dog4.age = 5;
        dog4.dogInfo();
        System.out.println();

        // Setting attributes for dog5
        System.out.println("Dog5 information: ");
        dog5.name = "Max";
        dog5.breed = "German Shepherd";
        dog5.colour = "Black and Tan";
        dog5.age = 6;
        dog5.dogInfo();
        System.out.println();

    }
}
class Dog {
    //Attributes of dog
    String name;
    String breed;
    String colour;
    int age;

    //Dog information
    public void dogInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Breed: " + this.breed);
        System.out.println("Colour: " + this.colour);
    }
}