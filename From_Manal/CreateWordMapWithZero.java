import java.util.HashMap;
import java.util.Map;

// Creates a map where every word from the array has value 0
public class CreateWordMapWithZero {
    public Map<String, Integer> createWordMapWithZero(String[] words) {
        Map<String, Integer> result = new HashMap<>();
        for (String word : words) {
            result.put(word, 0);
        }
        return result;
    }
}