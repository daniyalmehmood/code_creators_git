import java.util.Map;

//Map-1 > topping1
public class ToppingHandler {
    public static Map<String, String> addToppings(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
            map.put("bread", "butter");
        } else {
            map.put("bread", "butter");
        }
        return map;
    }

}
