package Oct.Practice;

public class Ex18_Reverse_String {
        public static void main(String[] args) {
            // Step 1: Declare and initialize the original string
            String name = "Vrushali Nivangune";

            // Step 2: Create an empty StringBuilder object to store the reversed string
            StringBuilder rev = new StringBuilder();

            // Step 3: Loop through the original string from last index to first
            // name.length() - 1 gives the last index since index starts from 0
            for (int i = name.length() - 1; i >= 0; i--) {

                // Step 4: Extract each character from the end using charAt(i)
                // and append it to the StringBuilder
                rev.append(name.charAt(i));
            }

            // Step 5: Convert StringBuilder to String and print the result
            System.out.println("Original String: " + name);
            System.out.println("Reversed String: " + rev.toString());
        }


}
