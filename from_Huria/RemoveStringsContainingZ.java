import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveStringsContainingZ {
    public static List<String> removeStringsContainingZ(List<String> strings) {
        String String = "";
        List<String> modifiableList = new ArrayList<>(strings);
        modifiableList.removeIf(str -> str.contains("z"));
        return modifiableList;
    }

    public static void main(String[] args) {
        System.out.println(removeStringsContainingZ(Arrays.asList("aaa", "bbb", "aza")));
        System.out.println(removeStringsContainingZ(Arrays.asList("hziz", "hzello", "hi")));
        System.out.println(removeStringsContainingZ(Arrays.asList("hello", "howz", "are", "youz")));
    }
}