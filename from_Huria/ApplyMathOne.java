import java.util.Arrays;
import java.util.List;

public class ApplyMathOne {
    public static List<Integer> applyMathOne(List<Integer> nums) {
        nums.replaceAll(n -> (n + 1) * 10);
        return nums;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        System.out.println(applyMathOne(numbers));

    }
}
