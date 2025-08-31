// Functional-1 > addStar
import java.util.List;

public class StringModifier {
    public List<String> addStarToAllStrings(List<String> strings) {
        strings.replaceAll(s -> s + "*");
        return strings;
    }
}