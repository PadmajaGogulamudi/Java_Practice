package collections;
import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {

        // Input array
        String[] words = {"eat", "tea", "tea", "tan", "ate", "nat", "bat", "ate"};

        // a) Use Set to store unique words
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println("Unique words : " + uniqueWords);

        // b) Use Map to group words that are anagrams
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : uniqueWords) {
            // Convert the word to a char array, sort it to get a key
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);  // e.g., "eat" -> "aet"

            // Add the word to its corresponding anagram group
            anagramMap.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        // Now format and print anagrams
        System.out.print("\nAnagrams : [ ");
        for (List<String> group : anagramMap.values()) {
            System.out.print(group.get(0) + " = " + group + " , ");
        }
        System.out.println("]");
    }
}
