import java.util.HashMap;
import java.util.Map;

public class MapTransformerABC {//Map-1 > mapShare
    public static void main(String[] args) {
        System.out.println(copyAtoBAndRemoveC(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "ccc")))); // → {"a": "aaa", "b": "aaa"}
        System.out.println(copyAtoBAndRemoveC(new HashMap<>(Map.of("b", "xyz", "c", "ccc")))); // → {"b": "xyz"}
        System.out.println(copyAtoBAndRemoveC(new HashMap<>(Map.of("a", "aaa", "c", "meh", "d", "hi")))); // → {"a": "aaa", "b": "aaa", "d": "hi"}
    }
    public static Map<String, String> copyAtoBAndRemoveC(Map<String, String> map) {
        if(map.containsKey("a")) {
            map.put("b", map.get("a"));//set b to have value of a
        }
        map.remove("c");
        return map;
    }
}