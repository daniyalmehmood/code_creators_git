import java.util.ArrayList;
import java.util.List;
public class RemoveTeenNumbers {
    public static List<Integer> filterOutTeens(List<Integer> nums) {
        nums.removeIf(n->(n>=13&&n<=19)); // remove any input value is in 13-19 range
        return nums;
    }
    public static void main(String[] args) {
        System.out.println(filterOutTeens(new ArrayList<>(List.of(12, 13, 19, 20))));
    }
}
