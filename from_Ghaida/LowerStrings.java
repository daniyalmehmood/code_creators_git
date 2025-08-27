import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LowerStrings {//Functional-1 > lower

    public static void main(String[] args) {
        System.out.println(toLowerCaseList(Arrays.asList("Hello", "Hi")));              // → [hello, hi]
        System.out.println(toLowerCaseList(Arrays.asList("AAA", "BBB", "ccc")));        // → [aaa, bbb, ccc]
        System.out.println(toLowerCaseList(Arrays.asList("KitteN", "ChocolaTE")));      // → [kitten, chocolate]
    }
    public static List<String> toLowerCaseList(List<String> strings) {
        return strings.stream().map(string -> string.toLowerCase()).collect(Collectors.toList());
    }
}
