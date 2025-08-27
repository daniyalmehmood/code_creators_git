import java.util.Map;
//Map-1 > mapAB4
public class LengthBasedMapper {
    public static Map<String, String> compareABandSetC(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").length() == map.get("b").length()) {
                map.put("a", "");
                map.put("b", "");
            } else if (map.get("a").length() > map.get("b").length()) {
                map.put("c", map.get("a"));
            } else {
                map.put("c", map.get("b"));
            }
        }
        return map;
    }
}
