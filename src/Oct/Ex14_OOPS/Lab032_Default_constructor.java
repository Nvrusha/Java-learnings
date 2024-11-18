package Oct.Ex14_OOPS;

public class Lab032_Default_constructor {
    public static void main(String[] args) {
        //In Java, a default constructor is a constructor that the Java compiler automatically provides
        //if no other constructors are defined in the class.
        //When a class has a default constructor, it allows objects to be created even if no specific data is
        //provided.

        Book book = new Book(); // Calls default constructor
        System.out.println("Title: " + book.title);   // Output: "Unknown Title"
        System.out.println("Author: " + book.author); // Output: "Unknown Author"
        System.out.println("Price: " + book.price);   // Output: 0.0

    }
}

class Book {
    String title;
    String author;
    double price;

    // Default constructor provided by compiler
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }
}