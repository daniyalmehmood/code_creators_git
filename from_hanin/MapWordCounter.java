import java.util.HashMap;
import java.util.Map;

public class MapWordCounter {
    public Map<String, Integer> getWordCounts(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < strings.length; i++) {
            String word = strings[i];
            int count = 1;
            if (map.containsKey(word)) {
                count = map.get(word) + 1;
            }

            map.put(word, count);
        }

        return map;
    }
}

