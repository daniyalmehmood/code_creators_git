import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class square56 {
    public static List<Integer> two2(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        nums.removeIf(n -> n % 10 == 2);
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(two2(new ArrayList<>(Arrays.asList(1, 2, 3))));
        System.out.println(two2(new ArrayList<>(Arrays.asList(2, 6, 11))));
        System.out.println(two2(new ArrayList<>(Arrays.asList(0))));
    }
}