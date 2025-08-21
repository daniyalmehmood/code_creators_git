import java.util.Map;

public class MapValueMoverToB {//Map-1 > mapBully
    public static void main(String[] args) {
        System.out.println(moveAtoB(new String[]{"a": "candy", "b": "dirt"}));// → {"a": "", "b": "candy"}
        System.out.println(moveAtoB(new String[]{"a": "candy"})); //  → {"a": "", "b": "candy"}
        System.out.println(moveAtoB(new String[]{"a": "candy", "b": "carrot", "c": "meh"}));// → {"a": "", "b": "candy", "c": "meh"}
    }
    public static Map<String, String> moveAtoB(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }
}