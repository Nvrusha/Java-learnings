package Oct.Practice;

import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex37_GroupAnagarams {
    public static void main(String[] args) {
        // Input array containing words
        String[] input = {"eat","tea","tan","ate","nat","bat"};

        // HashMap to store grouped anagrams
        // Key   -> sorted version of word
        // Value -> list of words that match that sorted pattern
        Map<String, List<String>> map = new HashMap<>();

        // Iterate through every word in the input array
        for(String word : input){

            // Convert the word into a character array
            // Example: "eat" -> ['e','a','t']
            char[] charArray = word.toCharArray();

            // Sort the characters of the array
            // Example: ['e','a','t'] -> ['a','e','t']
            Arrays.sort(charArray);

            // Convert sorted character array back into string
            // Example: ['a','e','t'] -> "aet"
            // This will act as the key in our HashMap
            String sortedWord = new String(charArray);

            // Check if the sorted key already exists in the map
            // If not, create a new empty list for that key
            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }

            // Retrieve the list associated with the sorted key
            // and add the current word to that list
            map.get(sortedWord).add(word);
        }

        // Print all grouped anagrams
        // map.values() returns only the lists stored in the map
        System.out.println(map.values());
    }
}
