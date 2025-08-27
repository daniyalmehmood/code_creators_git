import java.util.HashMap;
import java.util.Map;

public class WordOccurrenceMap {
    public Map<String, Boolean> checkForMultiples(String[] strings) {
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
