package Oct.Ex16_Errors_And_Exceptions.Exceptions.HandlingException;

public class SingleException {
    public static void main(String[] args) {
        //Handling a Single Exception

        // try-catch Block:
        // - Used to handle exceptions.
        //         - Syntax:
        // try {
        //     // Code that may throw an exception
        // } catch (ExceptionType e) {
        //     // Handle the exception
        // }

      try {
          int result = 10 / 0;  // Throws ArithmeticException
      }
      catch (ArithmeticException e){
          System.out.println("Error: Division by zero is not allowed!");
      }

    }
}
