import java.util.*;

public class MapAB4 {
    public static Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String av = map.get("a");
            String bv = map.get("b");
            if (av.length() != bv.length()) {
                map.put("c", av.length() > bv.length() ? av : bv);
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(mapAB4(new HashMap<>(Map.of("a", "aaa", "b", "bb", "c", "cake"))));
        System.out.println(mapAB4(new HashMap<>(Map.of("a", "aa", "b", "bbb", "c", "cake"))));
        System.out.println(mapAB4(new HashMap<>(Map.of("a", "aa", "b", "bbb"))));
    }
}