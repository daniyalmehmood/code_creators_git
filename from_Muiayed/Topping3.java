import java.util.*;

public class Topping3 {

    public static Map<String, String> topping3(Map<String, String> map) {
        if (map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
        }
        if (map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(topping3(new HashMap<>(Map.of("potato", "ketchup"))));
        System.out.println(topping3(new HashMap<>(Map.of("potato", "butter"))));
        System.out.println(topping3(new HashMap<>(Map.of("salad", "oil", "potato", "ketchup"))));
    }
}