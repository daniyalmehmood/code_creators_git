// Map-1 > mapBully

import java.util.Map;

public class MapValueShifter {
    public Map<String, String> moveValueFromAToB(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }
}