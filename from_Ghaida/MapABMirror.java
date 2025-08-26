import java.util.HashMap;
import java.util.Map;

public class MapABMirror {//Map-1 > mapAB3
    public static void main(String[] args) {
        System.out.println(mirrorAtoBOrBtoA(new HashMap<>(Map.of("a", "aaa", "c", "cake")))); //{"a": "aaa", "b": "aaa", "c": "cake"}
        System.out.println(mirrorAtoBOrBtoA(new HashMap<>(Map.of("b", "bbb", "c", "cake")))); //{"a": "bbb", "b": "bbb", "c": "cake"}
        System.out.println(mirrorAtoBOrBtoA(new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "cake")))); //{"a": "aaa", "b": "bbb", "c": "cake"}
    }
    public static Map<String, String> mirrorAtoBOrBtoA(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")) {
            map.put("a", map.get("a"));
            map.put("b", map.get("b"));
        }
        else if(map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        else if(map.containsKey("b")){
            map.put("a", map.get("b"));
        }
        return map;
    }
}