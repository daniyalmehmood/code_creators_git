import java.util.Arrays;
import java.util.List;

public class RightMostDigit {//Functional-1 > rightDigit

    public static void main(String[] args) {
        System.out.println(getRightDigits(Arrays.asList(1, 22, 93)));            // → [1, 2, 3]
        System.out.println(getRightDigits(Arrays.asList(16, 8, 886, 8, 1)));     // → [6, 8, 6, 8, 1]
        System.out.println(getRightDigits(Arrays.asList(10, 0)));                // → [0, 0]
    }
    public static List<Integer> getRightDigits(List<Integer> nums) {
        nums.replaceAll(number -> number % 10);
        return nums;
    }
}