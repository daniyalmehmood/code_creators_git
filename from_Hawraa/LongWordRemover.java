// Functional-2 > noLong

import java.util.List;

public class LongWordRemover {
    public List<String> removeLongStrings(List<String> strings) {
        strings.removeIf(s -> s.length() >= 4);
        return strings;
    }
}