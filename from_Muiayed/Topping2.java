import java.util.*;

public class Topping2 {

    public static Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(topping2(new HashMap<>(Map.of("ice cream", "cherry"))));
        System.out.println(topping2(new HashMap<>(Map.of("spinach", "dirt", "ice cream", "cherry"))));
        System.out.println(topping2(new HashMap<>(Map.of("yogurt", "salt"))));
    }
}