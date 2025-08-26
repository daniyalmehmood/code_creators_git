import java.util.Map;
import java.util.HashMap;

public class allSwap {
    public static String[] allSwap(String[] strings) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            char key = strings[i].charAt(0);
            if (map.containsKey(key)) {
                int j = map.remove(key);
                String tmp = strings[i];
                strings[i] = strings[j];
                strings[j] = tmp;
            } else {
                map.put(key, i);
            }
        }
        return strings;
    }

    public static void main(String[] args) {
        java.util.Arrays.stream(allSwap(new String[]{"ab", "ac"}))
                .forEach(System.out::println);
        java.util.Arrays.stream(allSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"}))
                .forEach(System.out::println);
        java.util.Arrays.stream(allSwap(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"}))
                .forEach(System.out::println);
    }
}