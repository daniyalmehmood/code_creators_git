import java.util.Arrays;
import java.util.List;

public class ZStringsRemover {//Functional-2 > noZ

    public static void main(String[] args) {
        System.out.println(removeStringsWithZ(Arrays.asList("aaa", "bbb", "aza")));            // → [aaa, bbb]
        System.out.println(removeStringsWithZ(Arrays.asList("hziz", "hzello", "hi")));         // → [hi]
        System.out.println(removeStringsWithZ(Arrays.asList("hello", "howz", "are", "youz"))); // → [hello, are]
    }
    public static List<String> removeStringsWithZ(List<String> strings) {
        strings.removeIf(number -> number.contains("z"));
        return strings;
    }
}