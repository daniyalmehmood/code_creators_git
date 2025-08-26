import java.util.Arrays;
import java.util.List;

public class NoTeenNumbers {//Functional-2 > noTeen

    public static void main(String[] args) {
        System.out.println(removeTeenNumbers(Arrays.asList(12, 13, 19, 20))); // → [12, 20]
        System.out.println(removeTeenNumbers(Arrays.asList(1, 14, 1)));       // → [1, 1]
        System.out.println(removeTeenNumbers(Arrays.asList(15)));             // → []
    }
    public static List<Integer> removeTeenNumbers(List<Integer> nums) {
        nums.removeIf(number -> number >= 13 && number <= 19);
        return nums;
    }
}