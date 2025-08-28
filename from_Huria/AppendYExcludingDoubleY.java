import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppendYExcludingDoubleY {
    public static List<String> appendYExcludingDoubleY(List<String> strings) {
        String String = "";
        List<String> modifiableList = new ArrayList<>(strings);
        modifiableList.replaceAll(str -> str + "y");
        modifiableList.removeIf(str -> str.contains("yy"));
        return modifiableList;
    }

    public static void main(String[] args) {
        System.out.println(appendYExcludingDoubleY(Arrays.asList("a", "b", "c")));
        System.out.println(appendYExcludingDoubleY(Arrays.asList("a", "b", "cy")));
        System.out.println(appendYExcludingDoubleY(Arrays.asList("xx", "ya", "zz")));
    }
}
