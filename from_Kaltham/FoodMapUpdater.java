Map-1 > topping2

import java.util.Map;

public class FoodMapUpdater {
    public Map < String,
    String > modifyMapToppings(Map < String, String > map) {
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }

        return map;
    }

}