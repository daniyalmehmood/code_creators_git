//Map-1 > mapAB2

import java.util.Map;

public class MapCleaner {
    public Map<String, String> removeMatchingKeys(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");

        }
        return map;
    }

}