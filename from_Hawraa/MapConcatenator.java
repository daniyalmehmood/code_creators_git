// Map-1 > mapAB

import java.util.Map;

public class MapConcatenator {
    public Map<String, String> mergeAAndBToAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }
}