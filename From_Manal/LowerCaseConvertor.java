import java.util.List;
public class LowerCaseConvertor {
    // Convert each string to lowercase
    public List<String> convertToLowercase(List<String> words) {
        words.replaceAll(s -> s.toLowerCase());
        return words;
    }
}