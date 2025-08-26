import java.util.ArrayList;
import java.util.List;
public class LowerCaseConverter {
    public static List<String> convertAllToLower(List<String> strings) {
        strings.replaceAll(str -> str.toLowerCase());//replace each element in the 'strings' list  to lower case version
        return strings; // return strings after modification
    }
    public static void main(String[] args) {
        List<String> Strings = new ArrayList<>(List.of("Hello", "Hi")); //create a list of integer values and assign the elements Hello, Hi
        System.out.println(convertAllToLower(Strings));
    }
}
