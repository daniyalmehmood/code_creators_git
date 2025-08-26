import java.util.*;

public class MapShare {
    public static Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }

    public static void main(String[] args) {
        System.out.println(mapShare(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "ccc"))));
        System.out.println(mapShare(new HashMap<>(Map.of("b", "xyz", "c", "ccc"))));
        System.out.println(mapShare(new HashMap<>(Map.of("a", "aaa", "c", "meh", "d", "hi"))));
    }
}