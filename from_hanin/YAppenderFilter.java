import java.util.List;

public class YAppenderFilter {
    public List<String> filterNoYY(List<String> strings) {
        strings.replaceAll(n -> n + "y");
        strings.removeIf (n -> n.contains("yy"));
        return strings;

    }

}
