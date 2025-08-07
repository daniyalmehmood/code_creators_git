public class MapShare {

    public Map<String, String> cleanAndCopyValues(Map<String, String> map) {
        map.remove("c");
        if (map.containsKey("a")){
            map.put("b",map.get("a"));
        }
        return map;
    }

}
