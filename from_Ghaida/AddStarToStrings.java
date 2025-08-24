import java.util.Arrays;
import java.util.List;

public class AddStarToStrings {//Functional-1 > addStar

    public static void main(String[] args) {
        System.out.println(appendStar(Arrays.asList("a", "bb", "ccc"))); // → [a*, bb*, ccc*]
        System.out.println(appendStar(Arrays.asList("hello", "there"))); // → [hello*, there*]
        System.out.println(appendStar(Arrays.asList("*")));             // → [**]
    }
    public static List<String> appendStar(List<String> strings) {
        strings.replaceAll(string -> string + "*");
        return strings;
    }
}