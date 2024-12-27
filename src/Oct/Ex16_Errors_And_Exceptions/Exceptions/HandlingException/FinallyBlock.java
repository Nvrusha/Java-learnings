package Oct.Ex16_Errors_And_Exceptions.Exceptions.HandlingException;

public class FinallyBlock {
    public static void main(String[] args) {
        //The finally block executes after the try block, regardless of whether an exception occurs.

        //try {
        //    // Code that may throw an exception
        //} catch (ExceptionType e) {
        //    // Code to handle the exception
        //} finally {
        //    // Code that always executes
        //}

        try {
            int result = 10 / 2; // No exception occurs
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e){
            System.out.println("Caught ArithmeticException");
        }
        finally {
            System.out.println("Finally block executed");
        }


    }
}
