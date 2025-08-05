import java.util.Map;

public class ModifyKeysValues {
    public static Map<String, String> checkABValues(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            return map;
        } else if (map.containsKey("b")) {
            map.put("a", map.get("b"));
        } else if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        } else return map;
        return map;
    }


}
