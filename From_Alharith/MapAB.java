public class MapAB {

    public Map<String, String> concatenateValuesOfAandB(Map<String, String> map) {
        if (map.containsKey("a")&&(map.containsKey("b")))  map.put("ab",map.get("a")+map.get("b"));
        else if (map.containsKey("a")) map.put("a",map.get("a"));
        else if (map.containsKey("b")) map.put("b",map.get("b"));
        return map;
    }

}
