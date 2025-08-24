import java.util.List;

public class RemoveCharactars {
    public List<String> noX(List<String> strings) {
        strings.replaceAll(str -> str.replace("x", ""));
        return strings;
    }

}
