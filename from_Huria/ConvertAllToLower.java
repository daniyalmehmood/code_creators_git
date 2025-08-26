import java.util.Arrays;
import java.util.List;

public class ConvertAllToLower {
    public static List<String> convertAllToLower(List<String> strings) {
        strings.replaceAll(str -> str.toLowerCase());
        return strings;
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "Hi");
        System.out.println(convertAllToLower(strings));

    }
}
