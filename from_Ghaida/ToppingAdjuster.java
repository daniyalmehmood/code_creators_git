import java.util.HashMap;
import java.util.Map;

public class ToppingAdjuster {//Map-1 > topping2
    public static void main(String[] args) {
        System.out.println(updateYogurtAndSpinach(new HashMap<>(Map.of("ice cream", "cherry")))); // {"yogurt": "cherry", "ice cream": "cherry"}
        System.out.println(updateYogurtAndSpinach(new HashMap<>(Map.of("spinach", "dirt", "ice cream", "cherry")))); // {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
        System.out.println(updateYogurtAndSpinach(new HashMap<>(Map.of("yogurt", "salt")))); // {"yogurt": "salt"}
    }
    public static Map<String, String> updateYogurtAndSpinach(Map<String, String> map) {
        if(map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }
        if(map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }
        return map;
    }
}