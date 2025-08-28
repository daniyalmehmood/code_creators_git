// Map-2 > wordMultiple

import java.util.HashMap;
import java.util.Map;

public class WordMultipleChecker {
    public Map<String, Boolean> wordHasMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String word = strings[i];
            if (map.containsKey(word)) {
                map.put(strings[i], true);
            } else {
                map.put(strings[i], false);
            }
        }
        return map;
    }
}