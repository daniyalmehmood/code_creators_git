import java.util.List;
public class StarAtEndAdder {
    // Add a star (*) at the end of each string
    public List<String> addStarAtEnd(List<String> words) {
        words.replaceAll(s -> s + "*");
        return words;
    }
}