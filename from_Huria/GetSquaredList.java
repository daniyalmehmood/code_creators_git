import java.util.Arrays;
import java.util.List;

public class GetSquaredList {
    public static List<Integer> getSquaredList(List<Integer> nums) {
        nums.replaceAll(n -> n * n);
        return nums;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        System.out.println(getSquaredList(numbers));

    }
}
