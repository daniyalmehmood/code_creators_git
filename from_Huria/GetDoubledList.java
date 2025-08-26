import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetDoubledList {
    public static List<Integer> getDoubledList(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        System.out.println(getDoubledList(numbers));

    }
}
 
