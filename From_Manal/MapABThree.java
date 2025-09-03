import java.util.Map;
import java.util.HashMap;

public class MapABThree {
    public static Map<String, String> synchronizeAB(Map<String, String> map) {
        boolean hasA = map.containsKey("a");
        boolean hasB = map.containsKey("b");

        // If exactly one of "a" or "b" exists
        if (hasA && !hasB) {
            // Copy value of "a" to "b"
            map.put("b", map.get("a"));
        }
        else if (!hasA && hasB) {
            // Copy value of "b" to "a"
            map.put("a", map.get("b")); 
        }

        return map;
    }

    public static void main(String[] args) {
        Map<String, String> example1 = new HashMap<>(Map.of("a", "aaa", "c", "cake"));
        System.out.println(synchronizeAB(example1));

        Map<String, String> example2 = new HashMap<>(Map.of("b", "bbb", "c", "cake"));
        System.out.println(synchronizeAB(example2));

        Map<String, String> example3 = new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "cake"));
        System.out.println(synchronizeAB(example3));
        
    }
}