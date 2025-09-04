import java.util.Arrays;
import java.util.List;

public class WrapWithY {//Functional-1 > moreY

    public static void main(String[] args) {
        System.out.println(AddYToString(Arrays.asList("a", "b", "c")));       // → [yay, yby, ycy]
        System.out.println(AddYToString(Arrays.asList("hello", "there")));    // → [yhelloy, ytherey]
        System.out.println(AddYToString(Arrays.asList("yay")));               // → [yyayy]
    }
    public static List<String> AddYToString(List<String> strings) {
        strings.replaceAll(string -> "y" + string + "y");
        return strings;
    }
}