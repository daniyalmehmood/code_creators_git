import java.util.Arrays;
import java.util.List;

public class DoublingNumbersInList {//Functional-1 > doubling

    public static void main(String[] args) {
        System.out.println(doubleListValues(Arrays.asList(1, 2, 3)));// → [2, 4, 6]
        System.out.println(doubleListValues(Arrays.asList(6, 8, 6, 8, -1)));// → [12, 16, 12, 16, -2]
        System.out.println(doubleListValues(Arrays.asList()));// → []
    }
    public static List<Integer> doubleListValues(List<Integer> nums) {
        nums.replaceAll(number -> number * 2);
        return nums;
    }
}