//Map-1 > mapAB2

import java.util.Map;

public class MapBalancer {
    public Map<String, String> fillMissingPairValue(Map<String, String> map) {
        if (map.containsKey("a") && !(map.containsKey("b"))) {
            map.put("b", map.get("a"));
        } else if (map.containsKey("b") && !(map.containsKey("a"))) {
            map.put("a", map.get("b"));
        }

        return map;


    }

}