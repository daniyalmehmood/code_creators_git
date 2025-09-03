import java.util.HashMap;
import java.util.Map;

// Maps first letter of each word to its last letter
public class MapFirstToLastChar {
    public Map<String, String> mapFirstToLastChar(String[] words) {
        Map<String, String> result = new HashMap<>();
        for (String word : words) {
            result.put(word.substring(0, 1), word.substring(word.length() - 1));
        }
        return result;
    }
}