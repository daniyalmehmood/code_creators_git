
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class noZ {
    public static List<String> noZ(List<String> strings) {
        strings.removeIf(s -> s.contains("z"));
        return strings;
    }

    public static void main(String[] args) {
        System.out.println(noZ(new ArrayList<>(Arrays.asList("aaa", "bbb", "aza"))));
        System.out.println(noZ(new ArrayList<>(Arrays.asList("hziz", "hzello", "hi"))));
        System.out.println(noZ(new ArrayList<>(Arrays.asList("hello", "howz", "are", "youz"))));
    }
}
