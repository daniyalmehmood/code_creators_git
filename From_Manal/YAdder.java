import java.util.List;
public class YAdder{
    // Add 'y' before and after each string
    public List<String> surroundWithY(List<String> words) {
        words.replaceAll(s -> "y" + s + "y");
        return words;
    }
}