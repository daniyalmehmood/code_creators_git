import java.util.ArrayList;
import java.util.List;
public class AddStarSuffix {
    public static List<String> addStarSuffix(List<String> strings) {
        strings.replaceAll(str->str + "*" ); // replace each element in the 'strings' list to string with *
        return strings; // return strings after modification
    }
    public  static void main(String[] args) {
        List<String> Strings = new ArrayList<>(List.of("a", "bb", "ccc")); //create a list of integer values and assign the elements a, bb, ccc
        System.out.println(addStarSuffix(Strings));
    }
}
