public class MapAB4 {
public Map<String, String> mapAB4(Map<String, String> map) {

        if(map.get("a")==null||map.get("b")==null){
            return map;
        }
        String valueOfa=map.get("a");
        String valueOfb=map.get("b");
        if(valueOfa.length()>valueOfb.length()){
            map.put("c",valueOfa);
        }
        else if (valueOfa.length()<valueOfb.length())
            map.put("c",valueOfb);
        else{
            map.put("a","");
            map.put("b","");
        }
        return map;
    }
}
