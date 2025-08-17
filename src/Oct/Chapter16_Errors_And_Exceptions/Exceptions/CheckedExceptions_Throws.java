package Oct.Chapter16_Errors_And_Exceptions.Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions_Throws {
    public static void main(String[] args) throws IOException {

        /*
        In Java, the throws keyword is used in a method signature to declare that the method may throw certain exceptions.
         Attempt to read from a file
        */

        BufferedReader reader = new BufferedReader(new FileReader("nonexistent_file.txt"));
        System.out.println(reader.readLine());
        reader.close();

    }
}
