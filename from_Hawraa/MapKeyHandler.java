// Map-1 > mapShare

import java.util.Map;

public class MapKeyHandler {
    public Map<String, String> mapShare(Map<String, String> map) {
        map.remove("c");
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        return map;
    }
}