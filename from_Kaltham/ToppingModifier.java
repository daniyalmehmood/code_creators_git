//Map-1 > topping1


import java.util.Map;

public class ToppingModifier {
    public Map < String,
    String > updateToppings(Map < String, String > map) {
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");

        }
        map.put("bread", "butter");
        return map;
    }

}