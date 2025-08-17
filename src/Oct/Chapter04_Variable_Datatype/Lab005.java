package Oct.Chapter04_Variable_Datatype;

public class Lab005 {
    public static void main(String[] args) {
        // Primitive data types

        byte smallNumber = 127; // 8 bits
        short mediumNumber = 32000; // 16 bits
        int largeNumber = 2000000; // 32 bits
        long veryLargeNumber = 3000000000L; // 64 bits
        float floatNumber = 5.75f; //32 bits
        double doubleNumber = 19.99; // 64 bits
        char letter = 'A'; // 16 bits
        boolean isJavaFun = true;

        // Non-Primitive data types

        // 1. Class: A blueprint for objects
        class Car {
            String color;
            int year;

            // Constructor to initialize Car object
            Car(String color, int year) {
                this.color = color;
                this.year = year;
            }
        }

        // 2. Array: A fixed-size collection of elements of the same type
        int[] numbers = {1, 2, 3};

        // 3. String: A sequence of characters
        String greeting = "Hello";

        // 4. Interface: A contract for classes to implement specific methods
        // Defining an interface called Animal
        interface Animal {
            void sound();  // abstract method
        }

        // 5. Enums
        // Loop through all enum values
        for (Day day : Day.values()) {
            System.out.println(day + ": " + day.getDescription() +
                    " (Weekend: " + day.isWeekend() + ")");
        }
    }
}

// Enums
enum Day {
    MONDAY("Start of the work week"),
    TUESDAY("Second day"),
    WEDNESDAY("Midweek"),
    THURSDAY("Almost Friday"),
    FRIDAY("Weekend starts soon"),
    SATURDAY("Relax day"),
    SUNDAY("Family day");

    // Field
    private final String description;

    // Constructor
    Day(String description) {
        this.description = description;
    }

    // Getter Method
    public String getDescription() {
        return description;
    }

    // Additional Method
    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}