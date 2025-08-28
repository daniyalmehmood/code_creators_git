// Map-2 > wordLen

import java.util.HashMap;
import java.util.Map;

public class WordLengthMapper {
    public Map<String, Integer> generateLengthMap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], strings[i].length());
        }
        return map;
    }
}