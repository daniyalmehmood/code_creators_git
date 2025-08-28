import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class lower {
    public static List<String> lower(List<String> strings) {
        strings.replaceAll(s -> s.toLowerCase());
        return strings;
    }

    public static void main(String[] args) {
        System.out.println(lower(new ArrayList<>(Arrays.asList("Hello", "Hi"))));
        System.out.println(lower(new ArrayList<>(Arrays.asList("AAA", "BBB", "ccc"))));
        System.out.println(lower(new ArrayList<>(Arrays.asList("KitteN", "ChocolaTE"))));
    }
}