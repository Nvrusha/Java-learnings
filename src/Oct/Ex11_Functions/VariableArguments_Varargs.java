package Oct.Ex11_Functions;

public class VariableArguments_Varargs {
    public static void main(String[] args) {
        // Creating an instance of the Calculator class
        Calculator calc = new Calculator();

        // Calling the sum method with a variable number of arguments
        // The varargs allows us to pass any number of integers without needing an array
        System.out.println(calc.sum(1, 87, 432, 55, 3, 2, 6));
        // Output: Sum of all numbers passed to the method
    }

}

// Calculator class containing the sum method
class Calculator {

    // The 'int... num' is a varargs parameter. It allows the method to accept 0 or more integers as input.
    public int sum(int... num) {
        int sum = 0; // Initialize sum to 0

        // Using a for-each loop to iterate over the 'num' array (varargs are treated as an array internally)
        for (int i : num) {
            sum = sum + i; // Add each number to the sum
        }

        // Return the total sum of the integers passed as arguments
        return sum;
    }
}