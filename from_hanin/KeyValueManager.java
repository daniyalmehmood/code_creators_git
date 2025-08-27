import java.util.Map;

//Map-1 > mapShare
public class KeyValueManager {
    public static Map<String, String> copyAtoBRemoveC(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.remove("c");
        } else {
            map.remove("c");
        }
        return map;
    }

}
