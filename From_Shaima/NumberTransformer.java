import java.util.ArrayList;
import java.util.List;
public class NumberTransformer {
    public static List<Integer> squareAndAddTenFilter(List<Integer> nums) {
        nums.replaceAll(n->(n*n)+10); // replace all input value to the squared value and add 10 to it
        nums.removeIf(n->(n%10==5||n%10==6)); // remove the value if the reminder is 5 or 6
        return nums;
    }
    public static void main(String[] args) {
        System.out.println(squareAndAddTenFilter(new ArrayList<>(List.of(3, 1, 4))));
    }
}
