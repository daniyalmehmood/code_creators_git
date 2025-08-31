import java.util.ArrayList;
import java.util.List;
public class AddYAndFilter {
    public static List<String> addYAndRemoveDoubleY(List<String> strings) {
        strings.replaceAll(str-> str+"y"); // Add y at the end to all input string
        strings.removeIf(str->str.contains("yy")); // if any string ends with yy remove it
        return strings;
    }
    public static void main(String[] args) {
        System.out.println(addYAndRemoveDoubleY(new ArrayList<>(List.of("a", "b", "cy"))));
    }
}
