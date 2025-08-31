import java.util.ArrayList;
import java.util.List;
public class StringLengthFilter {
    public static List<String> removeStringsWithLengthThreeOrFour(List<String> strings) {
        strings.removeIf(str->str.length()==3||str.length()==4); // remove any string if its length is 3 or 4
        return strings;
    }
    public static void main(String[] args) {
        System.out.println(removeStringsWithLengthThreeOrFour(new ArrayList<>(List.of("a", "bb", "ccc", "dddd","eeeee"))));
    }
}
