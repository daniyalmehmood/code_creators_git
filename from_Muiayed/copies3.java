import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class copies3 {
    public static List<String> copies3(List<String> strings) {
        strings.replaceAll(s -> s + s + s);
        return strings;
    }

    public static void main(String[] args) {
        System.out.println(copies3(new ArrayList<>(Arrays.asList("a", "bb", "ccc"))));
        System.out.println(copies3(new ArrayList<>(Arrays.asList("24", "a", ""))));
        System.out.println(copies3(new ArrayList<>(Arrays.asList("hello", "there"))));
    }
}