package Oct.Ex14_OOPS;

public class Lab031_Constructors_Practice {
    public static void main(String[] args) {
        // Creating a new Students object with name "Vrushali" and age 24
        Students s1 = new Students("Vrushali", 24);

        // Calling the printInfo method to display the student's information
        s1.printInfo();
    }
}
// Class to represent a student with attributes and a constructor
class Students{
    // Attributes to hold student's name and age
    String name;
    int age;

    // Method to print the student's information
    public void printInfo(){
        // Prints the student's name and age to the console
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    // Constructor to initialize the student's name and age
    Students(String name, int age){
        // 'this' keyword refers to the current object instance

        this.name = name;// Assigns the parameter name to the object's name attribute
        this.age = age; // Assigns the parameter age to the object's age attribute
    }
}