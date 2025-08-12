import java.util.Map;

public class MapToppingValues {
    public Map<String, String> toppingValue(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");

        }
        map.put("bread", "butter");
        return map;g
    }
}
