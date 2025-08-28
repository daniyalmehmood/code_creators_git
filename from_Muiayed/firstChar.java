import java.util.Map;
import java.util.HashMap;

public class firstChar {
    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String s : strings) {
            map.put(s.substring(0, 1), map.getOrDefault(s.substring(0, 1), "") + s);
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(firstChar(new String[]{"salt", "tea", "soda", "toast"}));
        System.out.println(firstChar(new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"}));
        System.out.println(firstChar(new String[]{}));
    }
}