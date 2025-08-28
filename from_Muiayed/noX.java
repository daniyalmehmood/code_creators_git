import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class noX {
    public static List<String> noX(List<String> strings) {
        strings.replaceAll(s -> s.replace("x", ""));
        return strings;
    }

    public static void main(String[] args) {
        System.out.println(noX(new ArrayList<>(Arrays.asList("ax", "bb", "cx"))));
        System.out.println(noX(new ArrayList<>(Arrays.asList("xxax", "xbxbx", "xxcx"))));
        System.out.println(noX(new ArrayList<>(Arrays.asList("x"))));
    }
}