import java.util.Map;
//Map-1 > mapAB3
public class KeyBalancer {
    public static Map<String, String> syncSingleAB(Map<String, String> map) {
        if (map.containsKey("a") ^ map.containsKey("b")) {
            if (map.containsKey("a")) {
                map.put("b", map.get("a"));
            }
            if (map.containsKey("b")) {
                map.put("a", map.get("b"));
            }
        }
        return map;
    }
}

