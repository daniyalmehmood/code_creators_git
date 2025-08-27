//Map-1 > mapBully

import java.util.Map;

public class ModifyMap {
    public Map<String, String> transferAtoB(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }
}
