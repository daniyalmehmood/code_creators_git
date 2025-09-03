import java.util.HashMap;
import java.util.Map;

// Groups words by their first character and concatenates them
public class GroupWordsByFirstChar {
    public Map<String, String> groupWordsByFirstChar(String[] words) {
        Map<String, String> result = new HashMap<>();
        for (String word : words) {
            String firstChar = word.substring(0, 1);
            if (result.containsKey(firstChar)) {
                result.put(firstChar, result.get(firstChar) + word);
            } else {
                result.put(firstChar, word);
            }
        }
        return result;
    }
}