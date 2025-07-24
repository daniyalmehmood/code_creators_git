import java.util.Map;

public class MapOne {
    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a"))
        {
            map.put("b",map.get("a"));
            map.put("a","");
        }
        return map;
    }
    public Map<String, String> mapShare(Map<String, String> map) {
        if(map.containsKey("a")){
            map.put("b",map.get("a"));
        }
        map.remove("c");
        return map;
    }
    public Map<String, String> mapAB(Map<String, String> map) {
        if(map.get("a")!=null&&map.get("b")!=null){
            map.put("ab",map.get("a")+map.get("b"));
        }
        return map;
    }
    public Map<String, String> topping1(Map<String, String> map) {
        if(map.containsKey("ice cream")){
            map.put("ice cream","cherry");
        }
        map.put("bread","butter");
        return map;
    }
    public Map<String, String> topping2(Map<String, String> map) {
        if(map.containsKey("ice cream")){
            map.put("yogurt",map.get("ice cream"));
        }
        if(map.containsKey("spinach")){
            map.put("spinach","nuts");
        }
        return map;


    }
    public Map<String, String> topping3(Map<String, String> map) {
        if(map.containsKey("potato")){
            map.put("fries",map.get("potato"));
        }
        if(map.containsKey("salad")){
            map.put("spinach",map.get("salad"));
        }
        return map;


    }
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
    public Map<String, String> mapAB3(Map<String, String> map) {
        if(map.get("a")!=null&&map.get("b")==null){
            map.put("b",map.get("a"));
        }
        else if(map.get("a")==null&&map.get("b")!=null){
            map.put("a",map.get("b"));
        }
        return map;
    }
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
