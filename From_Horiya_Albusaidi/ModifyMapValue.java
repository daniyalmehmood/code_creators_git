import java.util.Map;

public class ModifyMapValue {
    public Map<String, String> checkEqualityOfABValues(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }
}
