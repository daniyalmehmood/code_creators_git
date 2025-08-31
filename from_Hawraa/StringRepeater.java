// Functional-1 > copies3

import java.util.List;

public class StringRepeater {
    public List<String> tripleEachString(List<String> strings) {
        strings.replaceAll(s -> s + s + s);
        return strings;
    }
}