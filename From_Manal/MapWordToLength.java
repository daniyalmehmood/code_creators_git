import java.util.HashMap;
import java.util.Map;

// Maps each word to its length
public class MapWordToLength {
    public Map<String, Integer> mapWordToLength(String[] words) {
        Map<String, Integer> result = new HashMap<>();
        for (String word : words) {
            result.put(word, word.length());
        }
        return result;
    }
}