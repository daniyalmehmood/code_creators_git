import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class noTeen {
    public static List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(n -> n >= 13 && n <= 19);
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(noTeen(new ArrayList<>(Arrays.asList(12, 13, 19, 20))));
        System.out.println(noTeen(new ArrayList<>(Arrays.asList(1, 14, 1))));
        System.out.println(noTeen(new ArrayList<>(Arrays.asList(15))));
    }
}
