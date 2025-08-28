import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class addStar {
    public static List<String> addStar(List<String> strings) {
        strings.replaceAll(s -> s + "*");
        return strings;
    }

    public static void main(String[] args) {
        System.out.println(addStar(new ArrayList<>(Arrays.asList("a", "bb", "ccc"))));
        System.out.println(addStar(new ArrayList<>(Arrays.asList("hello", "there"))));
        System.out.println(addStar(new ArrayList<>(Arrays.asList("*"))));
    }
}