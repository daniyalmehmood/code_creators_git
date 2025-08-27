import java.util.Map;

//Map-1 > mapAB
public class KeyMerger {
    public static Map<String, String> mergeAandB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;

    }

}
