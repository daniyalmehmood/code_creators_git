import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class noYY {
    public static List<String> no34(List<String> strings) {
        strings.removeIf(s -> s.length() == 3 || s.length() == 4);
        return strings;
    }

    public static void main(String[] args) {
        System.out.println(no34(new ArrayList<>(Arrays.asList("a", "bb", "ccc"))));
        System.out.println(no34(new ArrayList<>(Arrays.asList("a", "bb", "ccc", "dddd"))));
        System.out.println(no34(new ArrayList<>(Arrays.asList("ccc", "dddd", "apple"))));
    }
}