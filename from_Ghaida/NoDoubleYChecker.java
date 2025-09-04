import java.util.Arrays;
import java.util.List;

public class NoDoubleYChecker {//Functional-2 > noYY

    public static void main(String[] args) {
        System.out.println(addYRemoveDoubleY(Arrays.asList("a", "b", "c")));       // → [ay, by, cy]
        System.out.println(addYRemoveDoubleY(Arrays.asList("a", "b", "cy")));      // → [ay, by]
        System.out.println(addYRemoveDoubleY(Arrays.asList("xx", "ya", "zz")));    // → [xxy, yay, zzy]
    }
    public static List<String> addYRemoveDoubleY(List<String> strings) {
        strings.replaceAll(string -> string + "y");
        strings.removeIf(string -> string.contains("yy"));
        return strings;
    }
}