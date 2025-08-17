package Oct.Chapter14_OOPS.Constructors;

import java.util.Scanner;

public class Lab033_Parameterized_Constructor {
    public static void main(String[] args) {

        // Creating a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the book name
        System.out.println("Enter book name: ");
        String bookName = scanner.nextLine();

        // Prompt user to enter the author name
        System.out.println("Enter author name: ");
        String authorName = scanner.nextLine();

        // Prompt user to enter the book price
        System.out.println("Enter book price: ");
        double price = scanner.nextDouble();

        // Creating an object of the Books class using the parameterized constructor
        Books book1 = new Books(bookName, authorName, price);

        // Displaying the book information using the bookInfo method
        book1.bookInfo();

    }
}

class Books{
    // Attributes of the Books class
    String bookName;    // Stores the name of the book
    String authorName;  // Stores the name of the author
    double price;       // Stores the price of the book

    // Parameterized constructor to initialize the attributes
    Books(String name, String author, double price) {
        this.bookName = name;          // Initializing bookName with the constructor's name parameter
        this.authorName = author;      // Initializing authorName with the constructor's author parameter
        this.price = price;            // Initializing price with the constructor's price parameter
    }

    // Method for displaying the book information
    public void bookInfo() {
        // Printing the book name
        System.out.println("Book name: " + this.bookName);
        // Printing the author name
        System.out.println("Author name: " + this.authorName);
        // Printing the book price
        System.out.println("Book price: " + this.price);
    }
}
