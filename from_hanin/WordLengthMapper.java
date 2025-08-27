import java.util.HashMap;
import java.util.Map;

public class WordLengthMapper {
    public Map<String, Integer> mapWordLengths(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < strings.length; i++) {
            String word = strings[i];
            map.put(word, word.length());
        }
        return map;
    }
}
