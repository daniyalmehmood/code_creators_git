import java.util.Arrays;
import java.util.List;

public class NoEndingNine {//Functional-2 > no9

    public static void main(String[] args) {
        System.out.println(removeNumbersEndingWithNine(Arrays.asList(1, 2, 19)));              // → [1, 2]
        System.out.println(removeNumbersEndingWithNine(Arrays.asList(9, 19, 29, 3)));          // → [3]
        System.out.println(removeNumbersEndingWithNine(Arrays.asList(1, 2, 3)));               // → [1, 2, 3]
    }
    public static List<Integer> removeNumbersEndingWithNine(List<Integer> nums) {
        nums.removeIf(number -> number % 10 == 9);// remove numbers if right digit is 9
        return nums;
    }
}
