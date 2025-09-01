import java.util.HashMap;
import java.util.Map;

public class WordCountMapper {
    public Map<String, Boolean> detectRepeatedStrings(String[] strings) {
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        for (int i = 0; i < strings.length; i++) {
            String word = strings[i];
            if (!map.containsKey(word)) {
                map.put(word, false);
            } else {
                map.put(word, true);
            }
        }

        return map;
    }
}
