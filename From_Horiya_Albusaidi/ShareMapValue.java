import java.util.Map;

public class ShareMapValue {
    public Map<String, String> modifyTheMabValue(Map<String, String> map) {
        if (map.containsKey("a")) {
            String aValue = map.get("a");
            map.put("b", aValue);

        }
        map.remove("c");
        return map;
    }
}
