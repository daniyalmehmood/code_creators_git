import java.util.Map;
import java.util.HashMap;

public class MapShare {
    public static Map<String, String> updateMap(Map<String, String> map) {
        // If "a" exists, set "b" to the same value
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }

        map.remove("c");

        return map;
    }

    public static void main(String[] args) {
        Map<String, String> example1 = new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "ccc"));
        System.out.println(updateMap(example1));
        
        Map<String, String> example2 = new HashMap<>(Map.of("b", "xyz", "c", "ccc"));
        System.out.println(updateMap(example2));

        Map<String, String> example3 = new HashMap<>(Map.of("a", "aaa", "c", "meh", "d", "hi"));
        System.out.println(updateMap(example3));
    }
}