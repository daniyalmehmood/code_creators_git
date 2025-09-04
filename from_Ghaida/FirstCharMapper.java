import java.util.HashMap;
import java.util.Map;

public class FirstCharMapper {//Map-2 > firstChar

    public static void main(String[] args) {
        System.out.println(groupWordsByFirstChar(new String[]{"salt", "tea", "soda", "toast"}));// → {"s": "saltsoda", "t": "teatoast"}
        System.out.println(groupWordsByFirstChar(new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"}));// → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
        System.out.println(groupWordsByFirstChar(new String[]{}));// → {}
    }
    public static Map<String, String> groupWordsByFirstChar(String[] strings) {
        Map<String, String> resultMap = new HashMap<>();
        for (String currentString : strings) {
            String firstChar = String.valueOf(currentString.charAt(0)); //get the first character as a String
            if (resultMap.containsKey(firstChar)) {
                resultMap.put(firstChar, resultMap.get(firstChar) + currentString);
            }
            else {
                resultMap.put(firstChar, currentString);
            }
        }
        return resultMap;
    }
}