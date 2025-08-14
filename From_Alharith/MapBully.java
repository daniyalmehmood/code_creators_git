public class MapBully {

    public Map<String, String> moveAValueToB(Map<String, String> map) {
        if (map.containsKey ("a")){
            map.put("b",map.get("a"));
            map.put("a","");
        }
        return map;

    }

}
