package Oct.Chapter15_WrapperClasses;

public class String_To_int {
    public static void main(String[] args) {

        //1. Using Integer.parseInt()
        //The most common method to convert a String to an int.
        //Throws a NumberFormatException if the string cannot be parsed into an integer.

        String str = "1234";
        int num = Integer.parseInt(str);
        System.out.println(num);

        //2. Using Integer.valueOf()
        //Converts a String to an Integer object (wrapper class).
        //You can use intValue() to get the primitive int from the Integer.

        String str1 = "9087656";
        Integer numObj = Integer.valueOf(str1); // Creates an Integer object
        int num1 = numObj; // Unboxing to primitive int
        System.out.println(num1);

    }
}
