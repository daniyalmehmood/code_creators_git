// Map-2 > pairs

import java.util.HashMap;
import java.util.Map;

public class FirstLastLetterMapper {
    public Map<String, String> generateFirstLastMap(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String word = strings[i];
            String key = word.substring(0, 1);
            String value = word.substring(word.length() - 1);
            map.put(key, value);
        }
        return map;
    }
}