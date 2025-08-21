import java.util.HashMap;
import java.util.Map;

public class MapToppingUpdater {//Map-1 > topping1
    public static void main(String[] args) {
        System.out.println(replaceIceCreamAndAddBread(new HashMap<>(Map.of("ice cream", "peanuts")))); // → {"bread": "butter", "ice cream": "cherry"}
        System.out.println(replaceIceCreamAndAddBread(new HashMap<>(Map.of()))); // → {"bread": "butter"}
        System.out.println(replaceIceCreamAndAddBread(new HashMap<>(Map.of("pancake", "syrup"))); // → {"bread": "butter", "pancake": "syrup"}
    }
    public static Map<String, String> replaceIceCreamAndAddBread(Map<String, String> map) {
        if(map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");// always add "bread":"butter"
        return map;
    }
}