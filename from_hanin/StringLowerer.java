import java.util.List;

public class StringLowerer {
    public List<String> convertToLower(List<String> strings) {
        strings.replaceAll(s -> s.toLowerCase());
        return strings;
    }

}
