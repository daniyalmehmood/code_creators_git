import java.util.Map;
import java.util.HashMap;

public class MapABFour {
    public static Map<String, String> updateCWithLongest(Map<String, String> map) {
        // Check if both "a" and "b" exist
        if (map.containsKey("a") && map.containsKey("b")) {
            String valueA = map.get("a");
            String valueB = map.get("b");

            // If values have the same length → set both to empty strings
            if (valueA.length() == valueB.length()) {
                map.put("a", "");
                map.put("b", "");
            } 
            else {
                // If values have different lengths → set "c" to the longer value
                if (valueA.length() > valueB.length()) {
                    map.put("c", valueA);
                } 
                else {
                    map.put("c", valueB);
                }
            }
        }

        return map;
    }

    public static void main(String[] args) {
        Map<String, String> example1 = new HashMap<>(Map.of("a", "aaa", "b", "bb", "c", "cake"));
        System.out.println(updateCWithLongest(example1));
 
        Map<String, String> example2 = new HashMap<>(Map.of("a", "aa", "b", "bbb", "c", "cake"));
        System.out.println(updateCWithLongest(example2));
        
        Map<String, String> example3 = new HashMap<>(Map.of("a", "aa", "b", "bbb"));
        System.out.println(updateCWithLongest(example3));
        
    }
}