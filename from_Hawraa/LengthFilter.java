// Functional-2 > no34

import java.util.List;

public class LengthFilter {
    public List<String> removeThreeFourLength(List<String> strings) {
        strings.removeIf(s -> s.length() == 4 || s.length() == 3);
        return strings;
    }
}