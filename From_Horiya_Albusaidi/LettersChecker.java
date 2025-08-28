import java.util.List;

public class LettersChecker {
    public List<String> extractYyFromElement(List<String> strings) {
        strings.replaceAll(str -> str + "y");
        strings.removeIf(str -> str.contains("yy"));
        return strings;

    }

}
