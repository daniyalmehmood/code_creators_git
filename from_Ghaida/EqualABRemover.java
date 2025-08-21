import java.util.HashMap;
import java.util.Map;

public class EqualABRemover {//Map-1 > mapAB2
    public static void main(String[] args) {
        System.out.println(removeEqualABKeys(new HashMap<>(Map.of("a", "aaa", "b", "aaa", "c", "cake")))); // {"c": "cake"}
        System.out.println(removeEqualABKeys(new HashMap<>(Map.of("a", "aaa", "b", "bbb")))); //  {"a": "aaa", "b": "bbb"}
        System.out.println(removeEqualABKeys(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "aaa")))); //{"a": "aaa", "b": "bbb", "c": "aaa"}
    }
    public static Map<String, String> removeEqualABKeys(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")) {
            if (map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }
}