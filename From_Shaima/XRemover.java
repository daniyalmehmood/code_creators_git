import java.util.ArrayList;
import java.util.List;
public class XRemover {
    public static List<String> deleteXChars(List<String> strings) {
        strings.replaceAll(str->str.replace("x","")); // replace each element in the 'strings' list a new version of x after removing x from the element
        return strings; // return strings after modification
    }
    public static void main(String[] args) {
        List<String> Strings = new ArrayList<>(List.of("ax", "bb", "cx")); //create a list of integer values and assign the elements ax, bb, cx
        System.out.println(deleteXChars(Strings));
    }
}
