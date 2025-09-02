import java.util.List;
public class  ThreeTimesRepeater{
    // Repeat each string 3 times
    public List<String> repeatThreeTimes(List<String> words) {
        words.replaceAll(s -> s + s + s);
        return words;
    }
}