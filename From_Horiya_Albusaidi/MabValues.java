import java.util.HashMap;
import java.util.Map;

public class MabValues {
    public static Map<String, String> replacingValues(Map<String, String> map) {

        if(map.containsKey("a"))
        {
            String aVlaue=map.get("a");
            map.put("a", "");
            map.put("b",aVlaue);
        }
        return map;
    }
    public static void main(String[] args) {
        Map<String, String> elements = new HashMap<>();
        elements.put("a","candy");
        elements.put("b","caroot");
        elements.put("c","mech");

        System.out.println(replacingValues(elements));
    }

}
