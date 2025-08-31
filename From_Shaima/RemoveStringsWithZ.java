import java.util.ArrayList;
import java.util.List;
public class RemoveStringsWithZ {
    public static List<String> filterOutStringsContainingZ(List<String> strings) {
        strings.removeIf(str->str.contains("z")); // remove the word contain 'z'
        return strings;
    }
    public static void main(String[] args) {
        System.out.println(filterOutStringsContainingZ(new ArrayList<>(List.of("aaa", "bbb", "aza"))));
    }
}
