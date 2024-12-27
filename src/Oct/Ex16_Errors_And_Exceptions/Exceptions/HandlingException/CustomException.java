package Oct.Ex16_Errors_And_Exceptions.Exceptions.HandlingException;

public class CustomException {

    // Step 2: Method that throws the custom exception
    public static void checkNumber (int num) throws MyCustomExceptions{
        if (num < 0){
            throw new MyCustomExceptions("Negative number not allowed: " + num);
        }
        System.out.println("The number is: " + num);
    }

    public static void main(String[] args) {
        try {
            // Step 3: Call the method and handle the custom exception
            checkNumber(-9); // This will throw the custom exception
        }
        catch (MyCustomExceptions e){
            // Step 4: Catch the custom exception and print the error message
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}


// Step 1: Define a custom exception
class MyCustomExceptions extends Exception{
    public MyCustomExceptions(String message){
        super(message); // Pass the message to the superclass (Exception)
    }
}

