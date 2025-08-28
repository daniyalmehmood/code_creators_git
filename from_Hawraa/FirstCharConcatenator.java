// Map-2 > firstChar

import java.util.HashMap;
import java.util.Map;

public class FirstCharConcatenator {
    public Map<String, String> concatWordsByFirstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String word = strings[i];
            String firstCharacter = word.substring(0, 1);
            if (map.containsKey(firstCharacter)) {
                map.put(firstCharacter, map.get(firstCharacter) + word);
            } else {
                map.put(firstCharacter, word);
            }
        }
        return map;
    }
}