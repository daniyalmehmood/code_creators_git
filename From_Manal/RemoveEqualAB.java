import java.util.Map;
import java.util.HashMap;

public class RemoveEqualAB {
    public static Map<String, String> removeIfEqual(Map<String, String> map) {
        // Check if both "a" and "b" exist in the map
        if (map.containsKey("a") && map.containsKey("b")) {
            // Check if values of "a" and "b" are the same
            if (map.get("a").equals(map.get("b"))) {
                // Remove both keys "a" and "b"
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }

    public static void main(String[] args) {
        Map<String, String> example1 = new HashMap<>(Map.of("a", "aaa", "b", "aaa", "c", "cake"));
        System.out.println(removeIfEqual(example1));

        Map<String, String> example2 = new HashMap<>(Map.of("a", "aaa", "b", "bbb"));
        System.out.println(removeIfEqual(example2));

        Map<String, String> example3 = new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "aaa"));
        System.out.println(removeIfEqual(example3));
    }
}