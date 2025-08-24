import java.util.List;

public class RemoveCharactars {
    public List<String> removeXLetterFromElement(List<String> strings) {
        strings.replaceAll(str -> str.replace("x", ""));
        return strings;
    }

}
