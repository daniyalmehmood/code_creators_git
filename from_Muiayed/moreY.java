import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class moreY {
    public static List<String> moreY(List<String> strings) {
        strings.replaceAll(s -> "y" + s + "y");
        return strings;
    }

    public static void main(String[] args) {
        System.out.println(moreY(new ArrayList<>(Arrays.asList("a", "b", "c"))));
        System.out.println(moreY(new ArrayList<>(Arrays.asList("hello", "there"))));
        System.out.println(moreY(new ArrayList<>(Arrays.asList("yay"))));
    }
}