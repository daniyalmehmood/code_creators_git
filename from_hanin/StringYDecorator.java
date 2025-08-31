import java.util.List;

public class StringYDecorator {
    public List<String> addYEnds(List<String> strings) {
        strings.replaceAll(s -> "y" + s + "y");
        return strings;
    }
}
