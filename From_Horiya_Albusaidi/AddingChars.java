import java.util.List;
public class AddingChars {
    public List<String> addStarToArrayElement(List<String> strings) {
        strings.replaceAll(str -> str + "*");
        return strings;
    }

}
