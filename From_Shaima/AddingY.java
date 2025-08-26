import java.util.ArrayList;
import java.util.List;
public class AddingY {
    public static List<String> wrapWithY(List<String> strings) {
        strings.replaceAll(str->"y"+str+"y"); //replace each element in the 'strings' list  and adding y before and last string
        return strings; // return strings after modification
    }
    public  static void main(String[] args) {
        List<String> Strings = new ArrayList<>(List.of("a", "b", "c")); //create a list of string values and assign the elements a, b, c
        System.out.println(wrapWithY(Strings));
    }
}
