import java.util.Arrays;
import java.util.List;

public class TripleCopiesOfString {//Functional-1 > copies3
    public static void main(String[] args) {
        System.out.println(tripleStrings(Arrays.asList("a", "bb", "ccc"))); // → [aaa, bbbbbb, ccccccccc]
        System.out.println(tripleStrings(Arrays.asList("24", "a", "")));    // → [242424, aaa, ]
        System.out.println(tripleStrings(Arrays.asList("hello", "there"))); // → [hellohellohello, theretherethere]
    }
    public static List<String> tripleStrings(List<String> strings) {
        strings.replaceAll(character -> character + character + character);// repeat each string 3 times
        return strings;
    }
}