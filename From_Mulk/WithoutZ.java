import java.util.List;

public class WithoutZ {
    public List<String> removeStringsWithZ(List<String> strings) {
        strings.removeIf(s -> s.contains("z"));
        return strings;
    }

}