package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        if (sentence.equals("")) {
            return new HashMap<>();
        }
        String[] words = sentence.split(" ");
        Map<String, Integer> wordsMap = new HashMap<>();
        for (String word : words) {
            if (wordsMap.containsKey(word)) {
                int currentValue = wordsMap.get(word);
                wordsMap.put(word, currentValue + 1);
            } else {
                wordsMap.put(word, 1);
            }
        }
        return wordsMap;
    }

    public static String toString(Map<String, Integer> wordsMap) {
       if (wordsMap.isEmpty()) {
           return "{}";
       }
       StringBuilder result = new StringBuilder();
        result.append("{\n");
        for (Map.Entry<String, Integer> word : wordsMap.entrySet()) {
            result.append("  ").append(word.getKey()).append(": ").append(word.getValue()).append("\n");
        }
        result.append("}");
        return result.toString();
    }
}
//END
