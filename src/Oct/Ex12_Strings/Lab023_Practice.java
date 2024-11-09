package Oct.Ex12_Strings;

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
        System.out.println(string.length());

        //2. .toLowerCase()
        System.out.println(string.toLowerCase());

        //3. .toUpperCase()
        System.out.println(string.toUpperCase());

        //4. .substring()
        System.out.println(string.substring(3 , 5));

        //5. .concat()
        System.out.println(string.concat(" Nivangune"));

        //6. .indexOf()
        System.out.println(string.indexOf("r", 3));

        //7. .replace()
        String text = "apple111 apple222 apple333";
        System.out.println(text.replace("p", "e"));

        //8. .replaceAll()
        String text1 = "apple1 apple2 apple3";
        System.out.println(text.replaceAll("\\d", "e"));

    }
}
