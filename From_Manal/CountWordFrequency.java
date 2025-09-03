import java.util.HashMap;
import java.util.Map;

// Counts how many times each word appears in the array
public class CountWordFrequency {
    public Map<String, Integer> countWordFrequency(String[] words) {
        Map<String, Integer> result = new HashMap<>();
        for (String word : words) {
            result.merge(word, 1, (currentCount, newValue) -> currentCount + 1);
        }
        return result;
    }
}