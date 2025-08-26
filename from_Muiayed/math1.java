import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class math1 {
    public static List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(n -> (n + 1) * 10);
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(math1(new ArrayList<>(Arrays.asList(1, 2, 3))));
        System.out.println(math1(new ArrayList<>(Arrays.asList(6, 8, 6, 8, 1))));
        System.out.println(math1(new ArrayList<>(Arrays.asList(10))));
    }
}