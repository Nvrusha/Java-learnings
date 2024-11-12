package Java.Ex12_Strings;

public class Lab022_Notes {
    public static void main(String[] args) {
        //Strings in Java are one of the most commonly used data types. Java provides the String
        //class to handle text data, and strings are treated as objects rather than primitive data types.
        //Here’s a breakdown of key concepts and functionalities related to strings in Java:

        //1. String Basics

        //A String in Java is an immutable sequence of characters, meaning once a String object is created,
        //it cannot be changed.

        //Declaring a string:

        //String str = "Hello, World!";

        //Alternatively, you can use the new keyword to create a String object explicitly:

        //String str = new String("Hello, World!");

        //2. Immutability of Strings

        //Since strings are immutable, every time you modify a string (e.g., concatenate it), Java creates
        //a new string object rather than modifying the existing one.
        //Example of concatenation:

        //String str1 = "Hello";
        //String str2 = str1 + " World";  // New string is created

        //3. String Pool

        //Java has a special memory area called the "String Pool" where string literals are stored.
        //If you create two strings with the same literal value, Java will point both references to the
        //same memory location in the pool rather than creating two separate objects.

        //String str1 = "Hello";
        //String str2 = "Hello";
        //System.out.println(str1 == str2);  // true, because they point to the same object in the string
        //pool

        //4. Common String Methods

        //Length: str.length() - Returns the length of the string.

        //Char at: str.charAt(index) - Returns the character at the specified index.

        //Substring: str.substring(start, end) - Returns a substring from the start index to the end index.

        //Concatenate: str.concat("text") - Concatenates the specified text to the end of the string.

        //Equals: str.equals(anotherStr) - Checks if two strings have the same value.

        //Equals Ignore Case: str.equalsIgnoreCase(anotherStr) - Checks if two strings are equal,
        //ignoring case.

        //Compare To: str.compareTo(anotherStr) - Compares two strings lexicographically.

        //To Upper Case / To Lower Case: str.toUpperCase() and str.toLowerCase() - Converts all
        //characters to uppercase or lowercase.

        //Trim: str.trim() - Removes any leading and trailing whitespace from the string.

        //Replace: str.replace('oldChar', 'newChar') - Replaces all occurrences of a character.

        //Starts With / Ends With: str.startsWith("prefix") and str.endsWith("suffix") - Checks if the
        //string starts or ends with a specific sequence.

        //Contains: str.contains("sequence") - Checks if the string contains a specific sequence of
        //characters.

        //5. String Comparison

        //Use equals() to compare the content of strings:

        //String str1 = "hello";
        //String str2 = "hello";
        //System.out.println(str1.equals(str2));  // true

        //== checks reference equality, not content:

        //String str1 = new String("hello");
        //String str2 = new String("hello");
        //System.out.println(str1 == str2);  // false, different references

        //6. String Formatting

        //Java provides String.format() to format strings using placeholders:

        //String name = "Alice";
        //int age = 25;
        //String formatted = String.format("My name is %s and I am %d years old", name, age);
        //System.out.println(formatted);  // Output: My name is Alice and I am 25 years old

        //7. StringBuilder and StringBuffer

        //StringBuilder and StringBuffer are mutable classes for strings.
        //StringBuilder: Fast and efficient for single-threaded environments. Use when modifying a
        //string frequently.
        //StringBuffer: Similar to StringBuilder but thread-safe (synchronized).
        //Example with StringBuilder:

        //StringBuilder sb = new StringBuilder("Hello");
        //sb.append(" World");
        //System.out.println(sb.toString());  // Output: Hello World

        //8. Converting Other Data Types to Strings

        //You can convert other data types to strings in various ways:
        //Using String.valueOf():

        //int num = 10;
        //String str = String.valueOf(num);  // "10"
        //Using Integer.toString(), Double.toString(), etc.

        //9. Splitting Strings

        //Split a string based on a delimiter using str.split(regex):

        //String data = "apple,orange,banana";
        //String[] fruits = data.split(",");

        //10. String Interning

        //intern() method in Java ensures that strings with the same content share a single reference
        //in the string pool:

        //String str1 = new String("Hello").intern();
        //String str2 = "Hello";
        //System.out.println(str1 == str2);  // true, after interning
        //Example Code Demonstrating Key Methods
        //Here's a small code example that combines some of these concepts:

        //public class StringDemo {
        //    public static void main(String[] args) {
        //        String greeting = " Hello, World! ";
        //        System.out.println("Original: " + greeting);
        //
        //        // Trim
        //        greeting = greeting.trim();
        //        System.out.println("Trimmed: " + greeting);
        //
        //        // Substring
        //        String sub = greeting.substring(0, 5);
        //        System.out.println("Substring: " + sub);
        //
        //        // Replace
        //        String replaced = greeting.replace("World", "Java");
        //        System.out.println("Replaced: " + replaced);
        //
        //        // Length
        //        System.out.println("Length: " + greeting.length());
        //
        //        // Compare
        //        System.out.println("Equals 'Hello, Java!': " + greeting.equals("Hello, Java!"));
        //
        //        // Converting to uppercase
        //        System.out.println("Uppercase: " + greeting.toUpperCase());
        //
        //        // StringBuilder example
        //        StringBuilder sb = new StringBuilder("Learning ");
        //        sb.append("Java Strings.");
        //        System.out.println("StringBuilder: " + sb.toString());
        //    }
        //}
        //Understanding how to work with strings effectively is essential in Java, especially since they
        //are so frequently used in both everyday programming and complex applications. Let me know if
        //you’d like more details on any specific method or topic!
    }
}
