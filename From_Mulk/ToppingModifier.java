//Map-1 > topping1

import java.util.Map;

public class ToppingModifier {
    public Map<String, String> adjustIceCreamAndBread(Map<String, String> map) {
        map.put("bread", ("butter"));
        if (map.containsKey("ice cream")) {
            map.put("ice cream", ("cherry"));

        }
        return map;
    }

}