import java.util.HashMap;
import java.util.Map;

public class FoodToppingUpdater {//Map-1 > topping3
    public static void main(String[] args) {
        System.out.println(updateToppingsMap(new HashMap<>(Map.of("potato", "ketchup")))); //{"potato": "ketchup", "fries": "ketchup"}
        System.out.println(updateToppingsMap(new HashMap<>(Map.of("potato", "butter")))); // {"potato": "butter", "fries": "butter"}
        System.out.println(updateToppingsMap(new HashMap<>(Map.of("salad", "oil", "potato", "ketchup")))); //{"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
    }
    public static Map<String, String> updateToppingsMap(Map<String, String> map) {
        if(map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
        }
        if(map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }
        return map;
    }
}