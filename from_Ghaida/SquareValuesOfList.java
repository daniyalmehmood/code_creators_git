import java.util.Arrays;
import java.util.List;

public class SquareValuesOfList {//Functional-1 > square

    public static void main(String[] args) {
        System.out.println(squareListValues(Arrays.asList(1, 2, 3)));// → [1, 4, 9]
        System.out.println(squareListValues(Arrays.asList(6, 8, -6, -8, 1)));// → [36, 64, 36, 64, 1]
        System.out.println(squareListValues(Arrays.asList()));// → []
    }
    public static List<Integer> squareListValues(List<Integer> nums) {
        nums.replaceAll(number -> number * number);
        return nums;
    }
}