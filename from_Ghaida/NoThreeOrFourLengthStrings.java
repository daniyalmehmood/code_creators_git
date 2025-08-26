import java.util.Arrays;
import java.util.List;

public class NoThreeOrFourLengthStrings {//Functional-2 > no34

    public static void main(String[] args) {
        System.out.println(removeStringsOfLengthThreeOrFour(Arrays.asList("a", "bb", "ccc")));               // → [a, bb]
        System.out.println(removeStringsOfLengthThreeOrFour(Arrays.asList("a", "bb", "ccc", "dddd")));       // → [a, bb]
        System.out.println(removeStringsOfLengthThreeOrFour(Arrays.asList("ccc", "dddd", "apple")));          // → [apple]
    }
    public static List<String> removeStringsOfLengthThreeOrFour(List<String> strings) {
        strings.removeIf(string -> string.length() == 4 || string.length() == 3);
        return strings;
    }
}