import java.util.Map;
import java.util.HashMap;

public class ToppingOne {
    public static Map<String, String> updatesToppings(Map<String, String> map) {
        // If "ice cream" exists, replace its value with "cherry"
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }

        map.put("bread", "butter");

        return map;
    }

    public static void main(String[] args) {
        Map<String, String> ex1 = new HashMap<>(Map.of("ice cream", "peanuts"));
        System.out.println(updatesToppings(ex1));

        Map<String, String> ex2 = new HashMap<>();
        System.out.println(updatesToppings(ex2));

        Map<String, String> ex3 = new HashMap<>(Map.of("pancake", "syrup"));
        System.out.println(updatesToppings(ex3));
    }
}