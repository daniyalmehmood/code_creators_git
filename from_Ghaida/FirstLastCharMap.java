import java.util.HashMap;
import java.util.Map;

public class FirstLastCharMap {//Map-2 > pairs

    public static void main(String[] args) {
        System.out.println(mapFirstToLastChar(new String[]{"code", "bug"}));// → {"b": "g", "c": "e"}
        System.out.println(mapFirstToLastChar(new String[]{"man", "moon", "main"}));// → {"m": "n"}
        System.out.println(mapFirstToLastChar(new String[]{"man", "moon", "good", "night"}));// → {"g": "d", "m": "n", "n": "t"}
    }
    public static Map<String, String> mapFirstToLastChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for(String str : strings){
                map.put(String.valueOf(str.charAt(0)), String.valueOf(str.charAt(str.length()-1)));
        }
        return map;
    }
}