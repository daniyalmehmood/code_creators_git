import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveStringsWithLengthThreeOrFour {
    public static List<String> removeStringsWithLengthThreeOrFour(List<String> strings) {
        String String = "";
        List<String> modifiableList = new ArrayList<>(strings);
        modifiableList.removeIf(str -> str.length() >= 3 && str.length() <= 4);
        return modifiableList;
    }

    public static void main(String[] args) {
        System.out.println(removeStringsWithLengthThreeOrFour(Arrays.asList("a", "bb", "ccc")));
        System.out.println(removeStringsWithLengthThreeOrFour(Arrays.asList("a", "bb", "ccc", "dddd")));
        System.out.println(removeStringsWithLengthThreeOrFour(Arrays.asList("ccc", "dddd", "apple")));
    }
}