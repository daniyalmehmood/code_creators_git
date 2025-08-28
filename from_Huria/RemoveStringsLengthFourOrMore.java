import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveStringsLengthFourOrMore {
    public static List<String> removeStringsLengthFourOrMore(List<String> strings) {
        String String = "";
        List<String> modifiableList = new ArrayList<>(strings);
        modifiableList.removeIf(str -> str.length() >= 4);
        return modifiableList;
    }

    public static void main(String[] args) {
        System.out.println(removeStringsLengthFourOrMore(Arrays.asList("this", "not", "too", "long")));
        System.out.println(removeStringsLengthFourOrMore(Arrays.asList("a", "bbb", "cccc")));
        System.out.println(removeStringsLengthFourOrMore(Arrays.asList("cccc", "cccc", "cccc")));
    }
}