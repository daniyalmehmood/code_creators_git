import java.util.List;

public class RemoveLongs {
    public List<String> removeLongStrings(List<String> strings) {
        strings.removeIf(s -> s.length() >= 4);
        return strings;
    }

}