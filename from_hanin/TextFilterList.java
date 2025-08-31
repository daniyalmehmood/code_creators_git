import java.util.List;

public class TextFilterList {
    public List<String> filterOutZ(List<String> strings) {
        strings.removeIf(s -> s.contains("z"));
        return strings;
    }

}
