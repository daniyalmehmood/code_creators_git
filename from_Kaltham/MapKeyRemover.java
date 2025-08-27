//Map-1 > mapAB2


import java.util.Map;

public class MapKeyRemover {
    public Map < String,
    String > removeEqualAB(Map < String, String > map) {
        if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

}