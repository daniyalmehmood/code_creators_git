import java.util.Arrays;
import java.util.List;

public class GetTripleCopies {
    public static List<String> getTripleCopies(List<String> strings) {
        strings.replaceAll (str -> str+str+str);
        return strings;
    }
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "bb", "ccc");
        System.out.println(getTripleCopies(strings));

    }
}
