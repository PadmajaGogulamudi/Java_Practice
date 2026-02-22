package com.GUT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//Top-K frequent words (case-insensitive, tie by alpha)
//Input
//words = ["Apple","banana","apple","Banana","apple","mango","Mango","mango"]
//k = 2
//Output
//["apple", "mango"]
//(apple=3, mango=3, banana=2 → tie apple/mango break by alpha: apple first)

public class Day13_Top_K_frequent_words {

    public static List<String> topKFrequent(String[] words, int k) {

        // Step 1: Count frequency (case-insensitive)
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            String lowerWord = word.toLowerCase();
            frequencyMap.put(lowerWord, frequencyMap.getOrDefault(lowerWord, 0) + 1);
        }

        // Step 2: Create a list of unique words
        List<String> wordList = new ArrayList<>(frequencyMap.keySet());

        // Step 3: Sort with custom comparator
        Collections.sort(wordList, (a, b) -> {
            int freqCompare = frequencyMap.get(b) - frequencyMap.get(a); // descending frequency

            if (freqCompare == 0) {
                return a.compareTo(b); // alphabetical order
            }

            return freqCompare;
        });

        // Step 4: Return top k words
        return wordList.subList(0, Math.min(k, wordList.size()));
    }

    public static void main(String[] args) {

        String[] words = {"Apple","banana","apple","Banana","apple","mango","Mango","mango"};
        int k = 2;

        List<String> result = topKFrequent(words, k);

        System.out.println(result);
    }
}