package Oct.Chapter16_Errors_And_Exceptions.Exceptions;

public class Notes {
    public static void main(String[] args) {
        /*
         ==============================
          Exceptions in Java - Notes
         ==============================

         --- What is an Exception? ---
         1. An exception is an event that disrupts the normal flow of a program.
         2. Exceptions are objects that extend the Throwable class.
         --- Types of Exceptions ---
         1. Checked Exceptions:
            - Checked at compile-time.
            - Must be handled using try-catch or declared in throws.
            - Examples: IOException, SQLException, ClassNotFoundException.

         2. Unchecked Exceptions:
            - Checked only at runtime (not compile-time).
            - Subclasses of RuntimeException.
            - Examples: NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException.

         3. Errors:
            - Serious problems that the application cannot handle.
            - Subclasses of Error.
            - Examples: OutOfMemoryError, StackOverflowError, VirtualMachineError.
         --- Common Checked Exceptions ---
         1. IOException: Issues with file I/O operations.
         2. FileNotFoundException: File not found during read/write operations.
         3. SQLException: Issues interacting with databases.
         4. ClassNotFoundException: Class loading issues.
         5. InterruptedException: Thread interruptions.
         --- Common Unchecked Exceptions ---
        */

/*
    1. NullPointerException: Accessing a method/field on a null object.
    2. ArithmeticException: Division by zero or similar issues.
    3. ArrayIndexOutOfBoundsException: Accessing an invalid index in an array.
    4. StringIndexOutOfBoundsException: Accessing an invalid index in a string.
    5. NumberFormatException: Invalid conversion of a string to a number.
*/

// --- Exception Handling Mechanisms ---
/*
    1. try-catch Block:
       - Used to handle exceptions.
       - Syntax:
         try {
             // Code that may throw an exception
         } catch (ExceptionType e) {
             // Handle the exception
         }
    2. finally Block:
       - Always executes, even if an exception is not thrown.
       - Used for resource cleanup.
    3. throws Keyword:
       - Declares that a method can throw exceptions.
       - Syntax: public void methodName() throws ExceptionType { ... }
    4. throw Keyword:
       - Explicitly throws an exception in code.
       - Syntax: throw new ExceptionType("Message");
*/


/*
 --- Example of Custom Exception ---
 class CustomException extends Exception {
     public CustomException(String message) {
         super(message); // Passes message to parent Exception class
     }
 }

 public class CustomExceptionExample {
     public static void main(String[] args) {
         try {
             throw new CustomException("This is a custom exception!");
         } catch (CustomException e) {
             System.out.println("Caught: " + e.getMessage());
         }

*/

    }
}
