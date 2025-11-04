package Oct.Practice;

public class Ex08_Count_VowelsConsonants {
    public static void main(String[] args) {
        // Step 1: Declare a string to analyze
        String str = "This is a really simple sentence";

        // Step 2: Create counters for vowels and consonants
        int vowelsCount = 0;
        int consonantsCount = 0;

        // Step 3: Convert the string to lowercase
        // This helps us handle both uppercase and lowercase letters easily
        str = str.toLowerCase();

        // Step 4: Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the current character

            // Step 5: Check if the character is a letter (a–z)
            if (ch >= 'a' && ch <= 'z') {

                // Step 6: If the character is a vowel, increase the vowel count
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelsCount++;
                }
                // Step 7: Otherwise, it’s a consonant
                else {
                    consonantsCount++;
                }
            }
            // Step 8: Ignore any other characters (spaces, punctuation, digits)
        }

        // Step 9: Print the results
        System.out.println("Vowels count: " + vowelsCount);
        System.out.println("Consonants count: " + consonantsCount);
    }
}
