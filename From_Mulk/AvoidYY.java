import java.util.List;

public class AvoidYY {
    public List<String> addYToEachAndRemoveDoubleY(List<String> strings) {
        strings.replaceAll(s -> s + "y");
        strings.removeIf(s -> s.contains("yy"));
        return strings;

    }

}