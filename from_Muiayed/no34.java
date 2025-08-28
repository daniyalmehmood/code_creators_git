import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class no34 {
    public static List<String> no34(List<String> strings) {
        strings.removeIf(s -> s.length() == 3 || s.length() == 4);
        return strings;
    }

    public static void main(String[] args) {
        List<String> example1 = new ArrayList<>(Arrays.asList("a", "bbb", "cccc", "dd", "hello"));
        List<String> example2 = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five"));
        List<String> example3 = new ArrayList<>(Arrays.asList("hi", "code", "java", "fun"));

        System.out.println(no34(example1));
        System.out.println(no34(example2));
        System.out.println(no34(example3));
    }
}