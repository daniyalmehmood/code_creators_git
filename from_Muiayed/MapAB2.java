import java.util.*;

public class MapAB2 {

    public static Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") &&
                Objects.equals(map.get("a"), map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "aaa", "c", "cake"))));
        System.out.println(mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "bbb"))));
        System.out.println(mapAB2(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "aaa"))));
    }
}