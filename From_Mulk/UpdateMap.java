//Map-1 > mapShare

import java.util.Map;

public class UpdateMap {
    public Map<String, String> copyAtoBAndRemoveC(Map<String, String> map) {
        map.remove("c");
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        return map;
    }

}
