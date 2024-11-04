package Oct.Practice;

public class Ex8_Count_VowelsConsonants {
    public static void main(String[] args) {
        //Count vowels and consonants in a String.

      String str = "This is a really simple sentence";
      int vowelsCount = 0;
      int consonantsCount = 0;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelsCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonantsCount++;
            }
        }
        System.out.println("Vowels count: " + vowelsCount);
        System.out.println("Consonants count: " + consonantsCount);

    }
}
