package Oct.Chapter12_Strings;

public class Lab023_Practice {
    public static void main(String[] args) {
        String str1 = "Hello";                    // Creates or reuses "Hello" in the String pool
        String str2 = "Hello";                    // Reuses the "Hello" from the String pool
        String str3 = new String("Hello"); // Creates a new object on the heap

        System.out.println(str1 == str2);  // true, both refer to the same object in the pool
        System.out.println(str1 == str3);  // false, str3 is a new object in the heap
        System.out.println(str1.equals(str3));  // true, because the content is the same

        // String methods

        String string = "Vrushali";

        //1. .length()
        System.out.println(string.length()); // Prints the length of the string

        //2. .toLowerCase()
        System.out.println(string.toLowerCase()); // Converts the string to lowercase

        //3. .toUpperCase()
        System.out.println(string.toUpperCase()); // Converts the string to uppercase

        //4. .substring(int startIndex, int endIndex)
        System.out.println(string.substring(3, 5)); // Extracts substring from index 3 to 4

        //5. .concat()
        System.out.println(string.concat(" Nivangune")); // Concatenates another string

        //6. .indexOf(char ch, int fromIndex)
        System.out.println(string.indexOf("r", 3)); // Finds index of 'r' starting from index 3

        //7. .replace(char oldChar, char newChar)
        String text = "apple111 apple222 apple333";
        System.out.println(text.replace("p", "e")); // Replaces all 'p' with 'e'

        //8. .replaceAll(String regex, String replacement)
        String text1 = "apple1 apple2 apple3";
        System.out.println(text1.replaceAll("\\d", "e")); // Replaces all digits with 'e'

        //9. .startsWith(String prefix)
        System.out.println(string.startsWith("V")); // Checks if string starts with "V"

        //10. .endsWith(String suffix)
        System.out.println(string.endsWith("r")); // Checks if string ends with "r"

        //11. .indexOf(String str)
        System.out.println(string.indexOf("r")); // Finds index of first occurrence of "r"

        //12. .charAt(int index)
        System.out.println(string.charAt(2)); // Returns character at index 2

        //13. .equals(Object another)
        System.out.println(string.equals("Vrushali")); // Checks if strings are equal

        //14. .equalsIgnoreCase(String another)
        System.out.println(string.equalsIgnoreCase("vrushali")); // Case-insensitive equality check

        //15. .isEmpty()
        System.out.println(string.isEmpty()); // Checks if string is empty

        //16. .contains(CharSequence sequence)
        System.out.println(string.contains("shu")); // Checks if string contains "shu"

        //17. .split(String regex)
        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println(word); // Splits the string by spaces
        }

        //18. .trim()
        String strWithSpaces = "   Vrushali   ";
        System.out.println(strWithSpaces.trim()); // Removes leading and trailing whitespaces

        //19. .compareTo(String anotherString)
        System.out.println(string.compareTo("Vrushali")); // Compares lexicographically

        //20. .compareToIgnoreCase(String anotherString)
        System.out.println(string.compareToIgnoreCase("vrushali")); // Case-insensitive comparison

        //21. .toCharArray()
        char[] charArray = string.toCharArray();
        for (char ch : charArray) {
            System.out.println(ch); // Converts string to char array
        }

        //22. .lastIndexOf(char ch)
        System.out.println(string.lastIndexOf("r")); // Finds last occurrence of "r"

        //23. .matches(String regex)
        System.out.println(string.matches("[A-Za-z]+")); // Checks if string matches regex

        //24. .intern()
        String interned = string.intern();
        System.out.println(interned); // Returns the string's reference from the string pool

        //25. .repeat(int count)
        System.out.println(string.repeat(3)); // Repeats the string 3 times
    }
}
