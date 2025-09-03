import java.util.Arrays;
import java.util.List;

public class ExtractRightDigits {
    public static List<Integer> extractRightDigits(List<Integer> nums) {
        nums.replaceAll(n -> n % 10);
        return nums;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 22, 93);
        System.out.println(extractRightDigits(numbers));

    }
}
