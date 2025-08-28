// Map-2 > wordCount

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public Map<String, Integer> getWordCounts(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String word = strings[i];
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        return map;
    }
}