package Oct.Practice;

public class Ex21_ReverseWordsAndCharacters {
    public static void main(String[] args) {
        // Input sentence to be reversed
        String str = "I love coding with java";

        // Splitting the sentence into individual words based on spaces
        String[] arr = str.split(" ");

        // To store the final reversed sentence
        String result = "";

        // Loop to reverse the order of words (iterate from last word to first)
        for(int i = arr.length - 1; i >= 0; i--) {

            // Store the current word
            String word = arr[i];

            // To store the reversed version of the current word
            String reversedWord = "";

            // Loop to reverse characters of the current word
            for(int j = word.length() - 1; j >= 0; j--) {

                // Append characters in reverse order
                reversedWord += word.charAt(j);
            }

            // Add reversed word to result with trailing space
            result += reversedWord + " ";
        }

        // Trim to remove extra space at the end and print the final output
        System.out.println(result.trim());
    }
}
