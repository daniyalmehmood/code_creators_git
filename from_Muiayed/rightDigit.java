import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class rightDigit {
    public static List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(n -> n % 10);
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(rightDigit(new ArrayList<>(Arrays.asList(1, 22, 93))));
        System.out.println(rightDigit(new ArrayList<>(Arrays.asList(16, 8, 886, 8, 1))));
        System.out.println(rightDigit(new ArrayList<>(Arrays.asList(10, 0))));
    }
}