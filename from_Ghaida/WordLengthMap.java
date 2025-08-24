import java.util.HashMap;
import java.util.Map;

public class WordLengthMap {//Map-2 > wordLen

    public static void main(String[] args) {
        System.out.println(createWordLengthMap(new String[]{"a", "bb", "a", "bb"}));// → {"bb": 2, "a": 1}
        System.out.println(createWordLengthMap(new String[]{"this", "and", "that", "and"}));// → {"that": 4, "and": 3, "this": 4}
        System.out.println(createWordLengthMap(new String[]{"code", "code", "code", "bug"}));// → {"code": 4, "bug": 3}
    }
    public static Map<String, Integer> createWordLengthMap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for(String str : strings){
            if(!map.containsKey(str)){
                map.put(str, str.length());
            }
        }
        return map;
    }
}