import java.util.Arrays;
import java.util.List;

public class DeleteXChars {
    public static List<String> deleteXChars(List<String> strings) {
        strings.replaceAll (str -> str.replace("x",""));
        return strings;
    }
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("ax", "bb", "cx");
        System.out.println(deleteXChars(strings));

    }
}
