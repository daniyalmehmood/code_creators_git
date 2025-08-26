import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class doubling {
    public static List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(doubling(new ArrayList<>(Arrays.asList(1, 2, 3))));
        System.out.println(doubling(new ArrayList<>(Arrays.asList(6, 8, 6, 8, -1))));
        System.out.println(doubling(new ArrayList<>()));
    }
}