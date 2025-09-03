import java.util.Map;
import java.util.HashMap;

public class ToppingThree {
    public static Map<String, String> updateToppings(Map<String, String> map) {
        // If "potato" exists, copy its value to "fries"
        if (map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
        }
        // If "salad" exists, copy its value to "spinach"
        if (map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

    public static void main(String[] args) {
        Map<String, String> example1 = new HashMap<>(Map.of("potato", "ketchup"));
        System.out.println(updateToppings(example1));

        Map<String, String> example2 = new HashMap<>(Map.of("potato", "butter"));
        System.out.println(updateToppings(example2));

        Map<String, String> example3 = new HashMap<>(Map.of("salad", "oil", "potato", "ketchup"));
        System.out.println(updateToppings(example3));
    }
}