import java.util.*;

public class mapAB {          // <- match the file name
    public static Map<String, String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");
        return map;
    }

    public static void main(String[] args) {
        System.out.println(topping1(new HashMap<>(Map.of("ice cream", "peanuts"))));
        System.out.println(topping1(new HashMap<>()));
        System.out.println(topping1(new HashMap<>(Map.of("pancake", "syrup"))));
    }
}