import java.util.ArrayList;
import java.util.List;
public class StringTripler {
    public static List<String> getTripleCopies(List<String> strings) {
        strings.replaceAll(str -> str+str+str); // replace each element in the 'strings' list to  3 times copies of it
        return strings; // return strings after modification
    }
    public  static void main(String[] args) {
        List<String> Strings = new ArrayList<>(List.of("a", "bb", "ccc")); //create a list of integer values and assign the elements a, bb, ccc
        System.out.println(getTripleCopies(Strings));
    }
}
