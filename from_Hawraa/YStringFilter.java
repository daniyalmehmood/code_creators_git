// Functional-2 > noYY

import java.util.List;

public class YStringFilter {
    public List<String> noDoubleY(List<String> strings) {
        strings.replaceAll(s -> s + "y");
        strings.removeIf(s -> s.contains("yy"));
        return strings;
    }
}