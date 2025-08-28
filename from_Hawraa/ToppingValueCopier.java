// Map-1 > topping3

import java.util.Map;

public class ToppingValueCopier {
    public Map<String, String> copyPotatoAndSaladValues(Map<String, String> map) {
        if (map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
        }
        if (map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }
        return map;
    }
}