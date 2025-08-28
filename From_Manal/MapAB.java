import java.util.Map;
import java.util.HashMap;

public class MapAB {
    public static Map<String, String> combineAB(Map<String, String> map) {
        // Check if both "a" and "b" exist
        if (map.containsKey("a") && map.containsKey("b")) {
            // Concatenate values of "a" and "b" and store under "ab"
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

    public static void main(String[] args) {
        Map<String, String> example1 = new HashMap<>(Map.of("a", "Hi", "b", "There"));
        System.out.println(combineAB(example1));
 
        Map<String, String> example2 = new HashMap<>(Map.of("a", "Hi"));
        System.out.println(combineAB(example2));

        Map<String, String> example3 = new HashMap<>(Map.of("b", "There"));
        System.out.println(combineAB(example3));
    }
}