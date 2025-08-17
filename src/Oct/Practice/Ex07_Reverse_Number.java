package Oct.Practice;

public class Ex07_Reverse_Number {
    public static void main(String[] args) {
        //Reverse the number using for loop. (In - 12345, Out - 54321)
        int num1 = 123456789;
        int rev1 = 0;

        for(;num1 != 0;){
            int lastDigit1 = num1 % 10;
            rev1 = rev1 * 10 + lastDigit1;
            num1 /= 10;
        }
        System.out.println("Reversed number: " + rev1);











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
