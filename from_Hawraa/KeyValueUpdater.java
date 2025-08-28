// Map-1 > mapAB3

import java.util.Map;

public class KeyValueUpdater {
    public Map<String, String> copyValueBetweenAB(Map<String, String> map) {
        if (map.containsKey("a") && !map.containsKey("b")) {
            map.put("b", map.get("a"));
        }
        if (map.containsKey("b") && !map.containsKey("a")) {
            map.put("a", map.get("b"));
        }
        return map;
    }
}