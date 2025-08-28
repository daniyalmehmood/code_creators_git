import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class noNeg {
    public static List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(noNeg(new ArrayList<>(Arrays.asList(1, -2))));
        System.out.println(noNeg(new ArrayList<>(Arrays.asList(-3, -3, 3, 3))));
        System.out.println(noNeg(new ArrayList<>(Arrays.asList(-1, -1, -1))));
    }
}
