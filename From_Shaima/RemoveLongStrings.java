import java.util.ArrayList;
import java.util.List;
public class RemoveLongStrings {
    public static List<String> filterShortStrings(List<String> strings) {
        strings.removeIf(str->str.length()>3); // remove any string if its length is more than 3
        return strings;
    }
    public static void main(String[] args) {
        System.out.println(filterShortStrings(new ArrayList<>(List.of("a", "bbb", "cccc"))));
    }
}
