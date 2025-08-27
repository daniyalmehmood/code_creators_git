import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DoublingNumbersInList {//Functional-1 > doubling

    public static void main(String[] args) {
        System.out.println(doubleListValues(Arrays.asList(1, 2, 3)));// → [2, 4, 6]
        System.out.println(doubleListValues(Arrays.asList(6, 8, 6, 8, -1)));// → [12, 16, 12, 16, -2]
        System.out.println(doubleListValues(Arrays.asList()));// → []
    }
    public static List<Integer> doubleListValues(List<Integer> nums) {
        return nums.stream().map(number -> number * 2).collect(Collectors.toList());
    }
}