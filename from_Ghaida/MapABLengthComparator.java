import java.util.HashMap;
import java.util.Map;

public class MapABLengthComparator {//Map-1 > mapAB4
    public static void main(String[] args) {
        System.out.println(compareABAndSetC(new HashMap<>(Map.of("a", "aaa", "b", "bb", "c", "cake"))));// → {"a": "aaa", "b": "bb", "c": "aaa"}
        System.out.println(compareABAndSetC(new HashMap<>(Map.of("a", "aa", "b", "bbb", "c", "cake"))));// → {"a": "aa", "b": "bbb", "c": "bbb"}
        System.out.println(compareABAndSetC(new HashMap<>(Map.of("a", "aa", "b", "bbb"))));// → {"a": "aa", "b": "bbb", "c": "bbb"}
    }
    public static Map<String, String> compareABAndSetC(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")){
            if(map.get("a").length() > map.get("b").length()){
                map.put("c", map.get("a"));
            }
            else if(map.get("b").length() > map.get("a").length()) {
                map.put("c", map.get("b"));
            }
            else{
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }
}
