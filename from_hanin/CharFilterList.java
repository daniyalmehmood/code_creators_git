import java.util.List;

public class CharFilterList {
    public List<String> deleteXChars(List<String> strings) {
        strings.replaceAll(s -> s.replace("x", ""));
        return strings;
    }
}
