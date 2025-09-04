import java.util.HashMap;
import java.util.Map;

public class WordMultipleMap {//Map-2 > wordMultiple

    public static void main(String[] args) {
        System.out.println(trackWordDuplicates(new String[]{"a", "b", "a", "c", "b"}));// → {"a": true, "b": true, "c": false}
        System.out.println(trackWordDuplicates(new String[]{"c", "b", "a"}));// → {"a": false, "b": false, "c": false}
        System.out.println(trackWordDuplicates(new String[]{"c", "c", "c", "c"}));// → {"c": true}
    }
    public static Map<String, Boolean> trackWordDuplicates(String[] strings) {
        Map<String, Boolean> result = new HashMap<>();
        for (String currentString : strings) {
            if (result.containsKey(currentString)) {
                result.put(currentString, true); //it appears 2nd time or more
            } else {
                result.put(currentString, false); // first time
            }
        }
        return result;
    }
}