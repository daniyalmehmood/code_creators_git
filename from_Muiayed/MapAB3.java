import java.util.*;

public class MapAB3 {
    public static Map<String, String> mapAB3(Map<String, String> map) {
        if (map.containsKey("a") && !map.containsKey("b")) {
            map.put("b", map.get("a"));
        } else if (!map.containsKey("a") && map.containsKey("b")) {
            map.put("a", map.get("b"));
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(mapAB3(new HashMap<>(Map.of("a", "aaa", "c", "cake"))));
        System.out.println(mapAB3(new HashMap<>(Map.of("b", "bbb", "c", "cake"))));
        System.out.println(mapAB3(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "cake"))));
    }
}