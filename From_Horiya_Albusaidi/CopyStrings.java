import java.util.List;

public class CopyStrings {
    public static List<String> copiesStringThreeTimes(List<String> strings) {
        strings.replaceAll(str -> str.repeat(3));
        return strings;
    }

}
