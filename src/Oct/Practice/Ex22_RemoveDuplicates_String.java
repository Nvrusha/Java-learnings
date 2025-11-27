package Oct.Practice;

public class Ex22_RemoveDuplicates_String {
    public static void main(String[] args) {

        String str = "programming"; // original string
        String result = "";         // to store result without duplicates

        // Loop through each character in string
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);   // get each character

            // If character not already added to result, then add it
            if(result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("After removing duplicates: " + result);

        // Logic:
        // 1. Loop through each character of the string.
        // 2. Use indexOf() to check if the character already exists in result.
        // 3. If not found (indexOf returns -1), add it to result.
        // 4. This keeps only first occurrence of each character.

    }
}
