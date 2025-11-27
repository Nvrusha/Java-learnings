package Oct.Practice;

import java.util.HashMap;
import java.util.Map;

public class Ex19_CharacterFrequency {
    public static void main(String[] args) {

        String str = "Vrushali Nivangune";  // Input string

        Map<Character, Integer> map = new HashMap<>();  // Character frequency map

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);  // get each character

            if(ch != ' ') {  // ignore spaces

                // If character already exists, increase count
                if(map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                }
                // Otherwise add with count = 1
                else {
                    map.put(ch, 1);
                }
            }
        }

        System.out.println(map);  // print frequency map
    }
}
