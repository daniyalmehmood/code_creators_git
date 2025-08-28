import java.util.Map;
import java.util.HashMap;

public class wordMultiple {
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        Map<String, Integer> counts = new HashMap<>();
        for (String s : strings) {
            int c = counts.getOrDefault(s, 0) + 1;
            counts.put(s, c);
            map.put(s, c >= 2);
        }
        for (String s : strings) {
            map.putIfAbsent(s, false);
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(wordMultiple(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(wordMultiple(new String[]{"c", "b", "a"}));
        System.out.println(wordMultiple(new String[]{"c", "c", "c", "c"}));
    }
}