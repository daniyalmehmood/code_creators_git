import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class noLong {
    public static List<String> noLong(List<String> strings) {
        strings.removeIf(s -> s.length() >= 4);
        return strings;
    }

    public static void main(String[] args) {
        System.out.println(noLong(new ArrayList<>(Arrays.asList("this", "not", "too", "long"))));
        System.out.println(noLong(new ArrayList<>(Arrays.asList("a", "bbb", "cccc"))));
        System.out.println(noLong(new ArrayList<>(Arrays.asList("cccc", "cccc", "cccc"))));
    }
}
