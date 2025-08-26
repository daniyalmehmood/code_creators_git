import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class square {
    public static List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n -> n * n);
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(square(new ArrayList<>(Arrays.asList(1, 2, 3))));
        System.out.println(square(new ArrayList<>(Arrays.asList(6, 8, -6, -8, 1))));
    }
}