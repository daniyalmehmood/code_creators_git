import java.util.Map;
import java.util.HashMap;

public class firstSwap {
    public static String[] firstSwap(String[] strings) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            char c = strings[i].charAt(0);
            if (map.containsKey(c)) {
                int j = map.get(c);
                if (j >= 0) {
                    String tmp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = tmp;
                    map.put(c, -1);
                }
            } else {
                map.put(c, i);
            }
        }
        return strings;
    }

    public static void main(String[] args) {
        java.util.Arrays.stream(firstSwap(new String[]{"ab", "ac"}))
                .forEach(System.out::println);
        java.util.Arrays.stream(firstSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"}))
                .forEach(System.out::println);
        java.util.Arrays.stream(firstSwap(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"}))
                .forEach(System.out::println);
    }
}
