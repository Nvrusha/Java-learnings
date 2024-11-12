package Oct.Practice;

public class Ex9_Palindrome_String {
    public static void main(String[] args) {
        //Palindrome of String

        String str = "ABCDCBA";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--){
            rev += str.charAt(i);
        }

        if(str.equals(rev)){  //  To compare the content of str and rev
            System.out.println("Given string is palindrome");
        }
        else {
            System.out.println("Not a palindrome string.");
        }
        }
}
