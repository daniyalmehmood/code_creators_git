// Functional-1 > lower

import java.util.List;

public class LowercaseConverter {
    public List<String> convertAllToLowercase(List<String> strings) {
        strings.replaceAll(s -> s.toLowerCase());
        return strings;
    }
}