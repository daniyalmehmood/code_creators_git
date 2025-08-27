import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class two2 {
    public static List<Integer> two2(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        nums.removeIf(n -> n % 10 == 2);
        return nums;
    }

    public static void main(String[] args) {
        List<Integer> example1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> example2 = new ArrayList<>(Arrays.asList(5, 6, 7, 8));
        List<Integer> example3 = new ArrayList<>(Arrays.asList(11, 12, 13));

        System.out.println(two2(example1));
        System.out.println(two2(example2));
        System.out.println(two2(example3));
    }
}