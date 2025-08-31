import java.util.List;

public class StarAppender {
    public List<String> starifyStrings(List<String> strings) {
        strings.replaceAll(s -> s + "*");
        return strings;
    }

}
