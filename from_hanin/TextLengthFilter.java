import java.util.List;

public class TextLengthFilter {
    public List<String> removeLengthThreeAndFour(List<String> strings) {
        strings.removeIf(s -> s.length() == 4 || s.length() == 3);
        return strings;
    }

}
