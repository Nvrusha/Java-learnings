package Oct.Chapter14_OOPS.Constructors;

public class Lab034_Overloading {
    public static void main(String[] args) {
        // Using no-argument constructor
        Gym g1 = new Gym();
        g1.display();

        // Using constructor with one parameter
        Gym g2 = new Gym("M fitness");
        g2.display();

        // Using constructor with two parameters
        Gym g3 = new Gym("Silver club", 1000);
        g3.display();
    }
}

class Gym{

    // Attributes (instance variables) of the Gym class
    String gymName;
    int fees;

    //No argument constructor
    Gym(){
        // Sets default values for gymName and fees
        gymName ="Unknown";
        fees = 2000;
    }

    //Constructor with one parameter
    Gym(String gymName){
        this.gymName = gymName;
        fees = 3000;
    }

    // Constructor with two parameters
    Gym(String gymName, int fees){
        this.gymName = gymName;
        this.fees = fees;
    }

    public void display(){
        System.out.println("Name: " + this.gymName + ", Fess: " + fees);
    }
}
