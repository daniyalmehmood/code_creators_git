import java.util.Map;

//Map-1 > topping2
public class FoodMapModifier {
    public static Map<String, String> applyToppingRules(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("ice cream", map.get("ice cream"));
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }
        return map;
    }

}
