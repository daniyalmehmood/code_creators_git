import java.util.Arrays;
import java.util.List;

public class RemoveLongStrings {//Functional-2 > noLong

    public static void main(String[] args) {
        System.out.println(removeLongStrings(Arrays.asList("this", "not", "too", "long"))); // → [not, too]
        System.out.println(removeLongStrings(Arrays.asList("a", "bbb", "cccc")));            // → [a, bbb]
        System.out.println(removeLongStrings(Arrays.asList("cccc", "cccc", "cccc")));       // → []
    }
    public static List<String> removeLongStrings(List<String> strings) {
        strings.removeIf(stringLength -> stringLength.length() >= 4);
        return strings;
    }
}