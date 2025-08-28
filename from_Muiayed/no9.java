import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class no9 {
    public static List<Integer> no9(List<Integer> nums) {
        nums.removeIf(n -> n % 10 == 9);
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(no9(new ArrayList<>(Arrays.asList(1, 2, 19))));
        System.out.println(no9(new ArrayList<>(Arrays.asList(9, 19, 29, 3))));
        System.out.println(no9(new ArrayList<>(Arrays.asList(1, 2, 3))));
    }
}