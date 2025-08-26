import java.util.Arrays;
import java.util.List;

public class RemoveLetterX {//Functional-1 > noX

    public static void main(String[] args) {
        System.out.println(removeXFromStrings(Arrays.asList("ax", "bb", "cx")));           // → [a, bb, c]
        System.out.println(removeXFromStrings(Arrays.asList("xxax", "xbxbx", "xxcx")));    // → [a, bb, c]
        System.out.println(removeXFromStrings(Arrays.asList("x")));                        // → [""]
    }
    public static List<String> removeXFromStrings(List<String> strings) {
        strings.replaceAll(removeX -> removeX.replace("x", ""));
        return strings;
    }
}