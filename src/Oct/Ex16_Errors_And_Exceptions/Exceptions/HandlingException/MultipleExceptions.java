package Oct.Ex16_Errors_And_Exceptions.Exceptions.HandlingException;

public class MultipleExceptions {
    public static void main(String[] args) {

        //Handling Multiple Exceptions with Nested Try Blocks

       try{
           try {
               String str = null;
               System.out.println(str.trim());  // NullPointerException
           }
           catch (NullPointerException e){
               System.out.println("Caught NullPointerException: String is null!");
           }
           int result = 10 / 0;   // ArithmeticException
       }
       catch (ArithmeticException e){
           System.out.println("Caught ArithmeticException: Division by zero!");
       }
    }
}
