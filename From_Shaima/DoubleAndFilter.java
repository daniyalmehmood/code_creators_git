import java.util.ArrayList;
import java.util.List;
public class DoubleAndFilter {
    public static List<Integer> doubleAndRemoveEndingWithTwo(List<Integer> nums) {
        nums.replaceAll(n->n*2);
        nums.removeIf(n->(n%10==2));
        return nums;
    }
    public static void main(String[] args) {
        System.out.println(doubleAndRemoveEndingWithTwo(new ArrayList<>(List.of(1, 2, 3))));
    }
}
