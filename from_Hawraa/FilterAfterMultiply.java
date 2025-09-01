// Functional-2 > two2

import java.util.List;

public class FilterAfterMultiply {
    public List<Integer> doubleAndFilterTwoEnd(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        nums.removeIf(n -> n % 10 == 2);
        return nums;
    }
}