import java.util.HashMap;
import java.util.Map;

public class word0 {
    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> result = new HashMap<>();
        for (String str : strings) {
            result.putIfAbsent(str, 0);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(word0(new String[]{"a", "b", "a", "b"}));
        System.out.println(word0(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(word0(new String[]{"c", "b", "a"}));
    }
}