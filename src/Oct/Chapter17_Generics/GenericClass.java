package Oct.Chapter17_Generics;

// Importing required packages

public class GenericClass {
    public static void main(String[] args) {
        // Create a Box object with Integer type
        Box<Integer> intBox = new Box<>();

        // Set the value of the box to 10
        intBox.setValue(10);

        // Print the value of the box
        System.out.println(intBox.getValue());
    }
}

// Generic class Box with a type parameter T
class Box<T> {
    // Generic field of type T
    private T value;

    // Setter method to set the value of type T
    public void setValue(T value) {
        this.value = value;
    }

    // Getter method to return the value of type T
    public T getValue() {
        return value;
    }
}
