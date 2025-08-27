//Map-1: mapAB4

import java.util.Map;

public class CompareAB {
    public Map<String, String> updateMapAccordingToABLengths(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") && map.get("b").length() == map.get("a").length()) {
            map.put("a", "");
            map.put("b", "");
        }
        if (map.containsKey("a") && map.containsKey("b") && map.get("a").length() > map.get("b").length()) {
            map.put("c", map.get("a"));
        }
        if (map.containsKey("a") && map.containsKey("b") && map.get("b").length() > map.get("a").length()) {
            map.put("c", map.get("b"));
        }
        return map;
    }
}