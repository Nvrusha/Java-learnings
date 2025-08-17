package Oct.Chapter16_Errors_And_Exceptions.Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions {
    public static void main(String[] args) {

        // Using try-with-resources to automatically close the resources after use
        try (BufferedReader reader = new BufferedReader(new FileReader("nonexistent_file.txt"))) {
            // Attempt to read the first line from the file
            System.out.println(reader.readLine());
        }
        // Catch block to handle the case when the file is not found
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());  // Print a message if the file doesn't exist
        }
        // Catch block to handle any other I/O errors
        catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());  // Print a message for general I/O errors

        }
    }
}
