import java.util.Arrays;
import java.util.List;

public class WrapWithY {
    public static List<String> wrapWithY(List<String> strings) {
        strings.replaceAll(str -> 'y' + str + 'y');
        return strings;
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", "c");
        System.out.println(wrapWithY(strings));

    }
}
