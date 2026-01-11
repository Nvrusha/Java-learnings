package Oct.Practice;

public class Ex09_Palindrome_String {
    public static void main(String[] args) {
        // Step 1: Initialize the string to check
        // A palindrome reads the same forward and backward
        String str = "ABCDCBA";

        // Step 2: Create an empty string to store the reversed version
        StringBuilder rev = new StringBuilder();

        // Step 3: Loop through the original string in reverse order
        // str.length() - 1 gives the index of the last character
        // The loop runs backward from last character to first
        for (int i = str.length() - 1; i >= 0; i--) {

            // Step 4: Get each character using charAt(i)
            // and add (concatenate) it to the reversed string
            rev.append(str.charAt(i));
        }

        // Step 5: Compare the original string and reversed string
        // .equals() compares the actual content, not object reference
        if (str.equals(rev.toString())) {
            System.out.println("Given string is a palindrome");
        } else {
            System.out.println("Not a palindrome string.");
        }
    }
}
