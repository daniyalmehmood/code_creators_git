import java.util.Map;
import java.util.HashMap;

public class ToppingTwo {
    public static Map<String, String> updateToppings(Map<String, String> map) {
        // If "ice cream" exists, copy its value to "yogurt"
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }

        // If "spinach" exists, change its value to "nuts"
        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }

        return map;
    }

    public static void main(String[] args) {
        Map<String, String> example1 = new HashMap<>(Map.of("ice cream", "cherry"));
        System.out.println(updateToppings(example1));

        Map<String, String> example2 = new HashMap<>(Map.of("spinach", "dirt", "ice cream", "cherry"));
        System.out.println(updateToppings(example2));

        Map<String, String> example3 = new HashMap<>(Map.of("yogurt", "salt"));
        System.out.println(updateToppings(example3));
    }
}