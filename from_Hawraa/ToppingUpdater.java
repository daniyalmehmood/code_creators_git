//Map-1 > topping1

import java.util.Map;

public class ToppingUpdater {
    public Map<String, String> customizeToppingsMap(Map<String, String> map) {
        map.put("bread", "butter");
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        return map;
    }
}