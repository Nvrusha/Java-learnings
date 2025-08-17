package Oct.Chapter16_Errors_And_Exceptions.Exceptions.HandlingException;

public class MultipleExceptions_UsingOR {
    public static void main(String[] args) {
        //In Java, multiple exceptions can be caught using the OR (|) operator in a catch block.

        //try {
        //    // Code that may throw exceptions
        //} catch (ExceptionType1 | ExceptionType2 e) {
        //    // Handle both exceptions here
        //}

        try {
            int[] arr = new int[2];
            arr[5] = 10;  // ArrayIndexOutOfBoundsException
            int result = 10 / 0; // ArithmeticException
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Exception occurred: " + e);
        }
    }
}
