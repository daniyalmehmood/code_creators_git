// Map-2 > word0

import java.util.HashMap;
import java.util.Map;

public class WordMapper {
    public Map<String, Integer> buildWordZeroMap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], 0);
        }
        return map;
    }
}