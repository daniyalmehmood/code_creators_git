import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class RemoveNegatives {

    public static List<Integer> removeNegatives(List<Integer> nums) {
        List<Integer> modifiableList = new ArrayList<>(nums);
        modifiableList.removeIf(number -> number < 0);
        return modifiableList;
    }

    public static void main(String[] args) {
        System.out.println(removeNegatives(Arrays.asList(1, -2)));
        System.out.println(removeNegatives(Arrays.asList(-3, -3, 3, 3)));
        System.out.println(removeNegatives(Arrays.asList(-1, -1, -1)));
    }
}
