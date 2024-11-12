package Oct.Ex12_Strings;

public class Lab024_StringBuilder_StringBuffer {
    public static void main(String[] args) {

        //StringBuffer

        StringBuffer stringBuffer = new StringBuffer("Vrushali");

        stringBuffer.append("Nivangune");         // Append text
        stringBuffer.insert(5 , "Hi");  // Insert text

        System.out.println(stringBuffer);

        //StringBuilder

        StringBuilder stringBuilder = new StringBuilder("Nivangune");

        stringBuilder.append("Vrushali");
        stringBuilder.insert(3, "Bye");

        System.out.println(stringBuilder);

    }
}
