//Map-1 > topping2

import java.util.Map;

public class AdjustToppings {
    public Map<String, String> modifyValuesForSpecificKeys(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }

        return map;
    }

}