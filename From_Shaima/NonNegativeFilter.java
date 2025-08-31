import java.util.ArrayList;
import java.util.List;
public class NonNegativeFilter {
    public  static List<Integer> filterNonNegative(List<Integer> nums) {
        nums.removeIf(n-> n<0); // to remove the negative value from the list
        return nums; // return nums list after removing negative values
    }
    public static void main(String[] args) {
        System.out.println(filterNonNegative(new ArrayList<>(List.of(1,-2))));
    }
}
