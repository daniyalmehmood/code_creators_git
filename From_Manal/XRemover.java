import java.util.List;
public class  XRemover{
    // Remove all 'x' characters from each string
    public List<String> removeXCharacters(List<String> words) {
        words.replaceAll(s -> s.replace("x", ""));
        return words;
    }
}