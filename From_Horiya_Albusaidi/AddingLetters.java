import java.util.List;

public class AddingLetters {
    public List<String> addLetterYToStartAndEndOfString(List<String> strings) {
        strings.replaceAll(str -> "y" + str + "y");
        return strings;
    }

}
