import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubleValuesExcludingEndingWithTwo {
    public static List<Integer> doubleValuesExcludingEndingWithTwo(List<Integer> nums) {
        List<Integer> modifiableList = new ArrayList<>(nums);
        modifiableList.replaceAll(n -> n * 2);
        modifiableList.removeIf(n -> n % 10 == 2);
        return modifiableList;
    }

    public static void main(String[] args) {
        System.out.println(doubleValuesExcludingEndingWithTwo(Arrays.asList(1, 2, 3)));
        System.out.println(doubleValuesExcludingEndingWithTwo(Arrays.asList(2, 6, 11)));
        System.out.println(doubleValuesExcludingEndingWithTwo(Arrays.asList(0)));
    }
}
