import java.util.ArrayList;
import java.util.List;
public class RemoveNumbersEndingWithNine {
    public static List<Integer> filterOutEndingWithNine(List<Integer> nums) {
        nums.removeIf(n -> (n % 10 == 9)); // remove if the reminder of input value ofter divided by 10 is 9
        return nums;
    }
    public static void main(String[] args) {
        System.out.println(filterOutEndingWithNine(new ArrayList<>(List.of(1, 2, 19))));
    }
}
