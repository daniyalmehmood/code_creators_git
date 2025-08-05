import java.util.Map;

public class MapToppingValueChecker {
    public Map<String, String> changeToppingValue(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));

        }
        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }
        return map;
    }

}

