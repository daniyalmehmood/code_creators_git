import java.util.HashMap;
import java.util.Map;

public class MapABCombiner {//Map-1 > mapAB
    public static void main(String[] args) {
        System.out.println(combineAAndB(new HashMap<>(Map.of("a", "Hi", "b", "There")))); //{"a": "Hi", "ab": "HiThere", "b": "There"}
        System.out.println(combineAAndB(new HashMap<>(Map.of("a", "Hi", "b", "There")))); //{"a": "Hi"}
        System.out.println(combineAAndB(new HashMap<>(Map.of("a", "Hi", "b", "There")))); //{"b": "There"}
    }
    public static Map<String, String> combineAAndB(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }
}