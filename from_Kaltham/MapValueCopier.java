//Map-1 > mapShare

import java.util.Map;

public class MapValueCopier {
    public Map < String,
    String > shareAtoBRemoveC(Map < String, String > map) {

        if (map.containsKey("a")) {
            map.put("b", map.get("a"));

        }
        map.remove("c");
        return map;
    }
}