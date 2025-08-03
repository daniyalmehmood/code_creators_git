public class MapAB2 {
    public Map<String, String> mapAB2(Map<String, String> map) {
        if(map.get("a")==null||map.get("b")==null){
            return map;
        }
        String valueOfa=map.get("a");
        String valueOfb=map.get("b");
        if(valueOfa.equals(valueOfb)){
            map.remove("a");
            map.remove("b");
        }
        return map;
    }
}
