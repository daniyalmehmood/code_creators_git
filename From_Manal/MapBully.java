import java.util.Map;
import java.util.HashMap;

public class MapBully {
    public static Map<String, String> mapBully(Map<String, String> map) {
        // Check if key "a" exists and has a non-empty value
        if (map.containsKey("a") && map.get("a").length() > 0) {
            // Copy the value of "a" into key "b"
            map.put("b", map.get("a"));
            // Set the value of "a" to empty string ""
            map.put("a", "");
        }
        return map;
    }

    public static void main(String[] args) {
        Map<String, String> ex1 = new HashMap<>(Map.of("a": "candy", "b": "dirt"));
        System.out.println(mapBully(ex1));

        Map<String, String> ex2 = new HashMap<>(Map.of("a", "candy"));
        System.out.println(mapBully(ex2));

        Map<String, String> ex3 = new HashMap<>(Map.of("a", "candy", "b", "carrot", "c", "meh"));
        System.out.println(mapBully(ex3));
    }
}