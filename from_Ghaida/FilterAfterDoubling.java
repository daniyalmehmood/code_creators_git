import java.util.Arrays;
import java.util.List;

public class FilterAfterDoubling {//Functional-2 > two2

    public static void main(String[] args) {
        System.out.println(doubleAndRemoveEndingTwo(Arrays.asList(1, 2, 3)));    // → [4, 6]
        System.out.println(doubleAndRemoveEndingTwo(Arrays.asList(2, 6, 11)));   // → [4]
        System.out.println(doubleAndRemoveEndingTwo(Arrays.asList(0)));          // → [0]
    }
    public static List<Integer> doubleAndRemoveEndingTwo(List<Integer> nums) {
        nums.replaceAll(number -> number * 2);
        nums.removeIf(number -> number % 10 == 2);
        return nums;
    }
}