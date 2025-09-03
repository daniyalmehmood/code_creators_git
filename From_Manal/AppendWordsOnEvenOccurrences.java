import java.util.HashMap;
import java.util.Map;

// Appends words each time they appear twice, four times, etc.
public class AppendWordsOnEvenOccurrences {
    public String appendWordsOnEvenOccurrences(String[] words) {
        Map<String, Integer> wordCount = new HashMap<>();
        String result = "";
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            if (wordCount.get(word) % 2 == 0) { // even occurrence
                result += word;
            }
        }
        return result;
    }
}