package Oct.Practice;

public class Ex07_Reverse_Number {
    public static void main(String[] args) {
        // 1🔹 Reverse the number using a for loop (Input: 123456789 → Output: 987654321)

//        int num1 = 123456789;   // Original number
//        int rev1 = 0;           // Variable to store the reversed number
//
//        // The loop continues until num1 becomes 0
//        // No initialization or update inside for parentheses, handled manually
//        for (; num1 != 0; ) {
//
//            // Step 1: Get the last digit using modulus operator (%)
//            int lastDigit1 = num1 % 10;
//
//            // Step 2: Multiply the existing reversed number by 10
//            // and add the extracted last digit to it
//            rev1 = rev1 * 10 + lastDigit1;
//
//            // Step 3: Remove the last digit from num1 by dividing it by 10
//            num1 /= 10;
//        }
//
//        // Step 4: Print the reversed number
//        System.out.println("Reversed number: " + rev1);




        // 2🔹 Reverse the number using a while loop (Input: 12345 → Output: 54321)

        int num = 12345;   // Original number to reverse
        int rev = 0;       // Variable to hold reversed result

        // Loop continues as long as the number is greater than 0
        while (num > 0) {

            // Step 1: Extract the last digit
            int lastDigit = num % 10;

            // Step 2: Add the last digit to reversed number after shifting digits left
            rev = (rev * 10) + lastDigit;

            // Step 3: Remove the last digit from the original number
            num = num / 10;
        }

        // Step 4: Print the reversed number
        System.out.println("Reversed number: " + rev);
    }
}
