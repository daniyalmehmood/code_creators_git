import java.util.List;

public class RemoveThreeFour {
    public List<String> removeStringsWithLengthThreeOrFour(List<String> strings) {
        strings.removeIf(s -> s.length() == 3 || s.length() == 4);
        return strings;
    }

}