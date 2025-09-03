import java.util.Map;
public class ToppingModifier {
    public Map<String, String> updateYogurtAndSpinach(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }
        return map;
    }
}
