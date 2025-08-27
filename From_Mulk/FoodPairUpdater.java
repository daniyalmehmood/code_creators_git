//Map-1 > topping3

import java.util.Map;

public class FoodPairUpdater {
    public Map<String, String> applyFoodNameMappings(Map<String, String> map) {
        if (map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
        }
        if (map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));

        }
        return map;
    }
}