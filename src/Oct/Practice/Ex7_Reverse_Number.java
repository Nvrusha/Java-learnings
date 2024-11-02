package Oct.Practice;

public class Ex7_Reverse_Number {
    public static void main(String[] args) {
        //Reverse the number using while loop. (In - 12345, Out - 54321)

        int num = 12345;   // Original number we want to reverse
        int rev = 0;       // Variable to store the reversed number

        while(num > 0){
            int lastDigit = num % 10;      // Get the last digit
            rev = (rev * 10) + lastDigit;  // Append the digit to rev
            num = num / 10;                // Remove the last digit from num
        }
        System.out.println("Reversed number: " + rev);

    }
}
