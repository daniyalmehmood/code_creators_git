//Map-1 > mapAB

import java.util.Map;

public class CombineMap {
    public Map<String, String> combineAAndBValues(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }
}