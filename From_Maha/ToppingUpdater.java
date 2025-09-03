import java.util.Map;
public class ToppingUpdater {
    public Map<String, String> updateIceCreamAndBread(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");
        return map;
    }
}
