import java.util.List;

public class TripleRepeater {
    public List<String> tripleStrings(List<String> strings) {
        strings.replaceAll(s -> s + s + s);
        return strings;
    }

}
