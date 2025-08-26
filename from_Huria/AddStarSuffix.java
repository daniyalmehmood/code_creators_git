import java.util.Arrays;
import java.util.List;

public class AddStarSuffix {
    public static List<String> addStarSuffix(List<String> strings) {
        strings.replaceAll(str -> str + "*");
        return strings;
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "bb", "ccc");
        System.out.println(addStarSuffix(strings));

    }
}
