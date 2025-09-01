// Functional-2 > noZ

import java.util.List;

public class RemoveZStrings {
    public List<String> removeStringHasZ(List<String> strings) {
        strings.removeIf(s -> s.contains("z"));
        return strings;
    }
}