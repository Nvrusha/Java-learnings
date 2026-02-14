package Oct.Practice;

public class Ex20_ReverseWords {
    public static void main(String[] args) {

        // Input string containing multiple words
        String str = "Vrushali Ravindra Nivangune";

        // Split the string into an array of words using space as the delimiter
        String[] arr = str.split(" ");

        // StringBuilder used for efficient string concatenation
        StringBuilder revStr = new StringBuilder();

        // Loop from the last word to the first to reverse the order of words
        for(int i = arr.length - 1; i >= 0; i--) {

            // Append each word followed by a space to the StringBuilder
            revStr.append(arr[i] + " ");
        }

        // Convert StringBuilder to String and trim trailing space before printing
        System.out.println(revStr);

    }
}
