import java.util.Map;

//Map-1 > mapAB2
public class KeyEqualityCleaner {
    public static Map<String, String> removeMatchingAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }
}


