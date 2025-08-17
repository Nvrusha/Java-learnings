package Oct.Chapter14_OOPS;

// Main class named 'OOPS'
public class OOPS {
    public static void main(String[] args) {
        // Creating the first object of the Pen class
        Pen pen1 = new Pen();

        // Setting attributes for pen1
        pen1.color = "Black";
        pen1.type = "Ball";
        pen1.price = 10;
        pen1.Write();

        // Creating the second object of the Pen class
        Pen pen2 = new Pen();

        // Setting attributes for pen2
        pen2.color = "Blue";
        pen2.type = "Gel";
        pen2.price = 20;

        // Calling printColor() on pen2 and pen1 to print their respective colors
        pen2.printColor();
        pen1.printColor();;
    }
}
// Pen class definition
class Pen{
    // Attributes (or fields) of the Pen class
    String color;
    String type;
    int price;

    // Method for writing
    public void Write(){
        System.out.println("Writing...");
    }
    // Method to print the color of the pen
    public void printColor(){
        System.out.println(this.color);
    }
}

