// Functional-1 > moreY

import java.util.List;

public class YStringFormatter {
    public List<String> addYAroundStrings(List<String> strings) {
        strings.replaceAll(s -> "y" + s + "y");
        return strings;
    }
}