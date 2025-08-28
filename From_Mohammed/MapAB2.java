public class MapAB2 {
    public Map<String, String> mapAB2(Map<String, String> map) {
        /*String searchA = map.get("a")*/
        if(map.containsKey("a") && map.containsKey("b") && (map.get("a").equals(map.get("b"))))
        {
            map.remove("a");
            map.remove("b");
        } return map;
    }

}
