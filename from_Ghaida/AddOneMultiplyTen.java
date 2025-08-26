import java.util.Arrays;
import java.util.List;

public class AddOneMultiplyTen {//Functional-1 > math1

    public static void main(String[] args) {
        System.out.println(incrementAndMultiplyBy10(Arrays.asList(1, 2, 3)));            // → [20, 30, 40]
        System.out.println(incrementAndMultiplyBy10(Arrays.asList(6, 8, 6, 8, 1)));      // → [70, 90, 70, 90, 20]
        System.out.println(incrementAndMultiplyBy10(Arrays.asList(10)));                 // → [110]
    }
    public static List<Integer> incrementAndMultiplyBy10(List<Integer> nums) {
        nums.replaceAll(number -> (number + 1) * 10);
        return nums;
    }
}