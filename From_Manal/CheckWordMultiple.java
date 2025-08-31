import java.util.HashMap;
import java.util.Map;

// Returns true if a word appears multiple times, false otherwise
public class CheckWordMultiple {
    public Map<String, Boolean> checkWordMultiple(String[] words) {
        Map<String, Boolean> result = new HashMap<>();
        for (String word : words) {
            if (result.containsKey(word)) {
                result.put(word, true);
            } else {
                result.put(word, false);
            }
        }
        return result;
    }
}