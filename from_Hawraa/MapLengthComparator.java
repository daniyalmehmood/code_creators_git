// Map-1 > mapAB4

import java.util.Map;

public class MapLengthComparator {
    public Map<String, String> compareABAndModify(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String aLength = map.get("a");
            String bLength = map.get("b");
            if (aLength.length() > bLength.length()) {
                map.put("c", map.get("a"));
            } else if (aLength.length() < bLength.length()) {
                map.put("c", map.get("b"));
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }
}