//Map-1 > mapBully

import java.util.Map;

public class KeyValueSwapper {
    public Map < String,
    String > moveAtoB(Map < String, String > map) {

        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");

        }
        return map;
    }
}