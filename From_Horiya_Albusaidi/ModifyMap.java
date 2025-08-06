import java.util.Map;

public class ModifyMap {
    public Map<String, String> mergeABValues(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String aValue = map.get("a");
            String bValue = map.get("b");
            map.put("ab", aValue + bValue);
        }
        return map;
    }
}
