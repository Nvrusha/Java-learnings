package Oct.Practice;

public class Ex27_Number_Swap {
    public static void main(String[] args) {
        // ================================
        // Method 1: Using Third Variable
        // ================================

        int a = 5;
        int b = 10;

        System.out.println("=== Using Third Variable ===");
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Step 1: Store value of 'a' in temporary variable
        int temp = a;

        // Step 2: Assign value of 'b' to 'a'
        a = b;

        // Step 3: Assign stored value (temp) to 'b'
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);


        // Reset values for second method
        a = 5;
        b = 10;

        System.out.println("\n=== Without Third Variable (Using XOR) ===");


        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // ==========================================
        // Method 2: Without Third Variable (XOR)
        // ==========================================


        // Step 1: Add both numbers and store in 'a'
        a = a + b;   // a = 15

        // Step 2: Subtract new 'a' with 'b' to get original 'a'
        b = a - b;   // b = 5

        // Step 3: Subtract new 'a' with new 'b' to get original 'b'
        a = a - b;   // a = 10

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
