import java.util.Map;

//Map-1 > topping3
public class MealMapTransformer {
    public static Map<String, String> convertSides(Map<String, String> map) {
        if (map.containsKey("potato")) {
            map.put("fries", map.get("potato"));


        }
        if (map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

}
