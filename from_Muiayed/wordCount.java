import java.util.Map;
import java.util.HashMap;

public class wordCount {
    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(wordCount(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(wordCount(new String[]{"c", "b", "a"}));
        System.out.println(wordCount(new String[]{"c", "c", "c", "c"}));
    }
}
