package Oct.Practice;

import java.util.Scanner;

/*
🎯 How To Explain This in Interview (Best Version)

Say this confidently:

"I reverse a string by traversing it from the last index to the first index.
In every iteration, I extract one character using charAt() and append it to a new string.
This builds the reversed string step by step.
Time complexity is O(n), but since String is immutable in Java, multiple concatenations
create new objects, making it less efficient. An optimized approach would use StringBuilder."

*/
/*
      LOGIC:

      Example:
      str = "JAVA"
      index: 0 1 2 3

      We start loop from last index → (length - 1)

      i=3 → A
      i=2 → V
      i=1 → A
      i=0 → J

      Final Output → "AVAJ"
      */
public class Ex18_Reverse_String {
        public static void main(String[] args) {


            // Creating Scanner object to take input
            Scanner sc = new Scanner(System.in);

            // Asking user to enter a string
            System.out.print("Enter a string to be reversed: ");

            // nextLine() reads full line including spaces
            String str = sc.nextLine();

            // String to store reversed output
            // NOTE: Keep it empty "" (not " ") to avoid extra space
            String reversed = "";

            for (int i = str.length() - 1; i >= 0; i--) {

                // Extract character from end and append to new string
                reversed = reversed + str.charAt(i);
            }

            // Printing reversed string
            System.out.println("Reversed String: " + reversed);

            sc.close();
        }

}

/*
🧠 Interview Follow-Up Questions

Q1: What is time complexity?
A: O(n) — we traverse the string once

Q2: Is this optimized?
A: No, because String is immutable in Java → creates multiple objects (O(n²) memory impact)

Q3: Optimized Solution?
Use StringBuilder:

StringBuilder sb = new StringBuilder(str);
System.out.println(sb.reverse());

Q4: What if string is null?
A: It throws NullPointerException → should add null check

Q5: Alternative ways?
- Using recursion
- Using stack
- Using char array swap
*/