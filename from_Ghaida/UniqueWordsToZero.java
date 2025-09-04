import java.util.HashMap;
import java.util.Map;

public class UniqueWordsToZero {//Map-2 > word0
    public static void main(String[] args) {
        System.out.println(assignZeroToWords(new String[]{"a", "b", "a", "b"}));// → {"a": 0, "b": 0}
        System.out.println(assignZeroToWords(new String[]{"a", "b", "a", "c", "b"}));// → {"a": 0, "b": 0, "c": 0}
        System.out.println(assignZeroToWords(new String[]{"c", "b", "a"}));// → {"a": 0, "b": 0, "c": 0}
    }
    public static Map<String, Integer> assignZeroToWords(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            if(!map.containsKey(str)){
                map.put(str, 0);
            }
        }
        return map;
    }
}