// Functional-1 > square

import java.util.List;

public class NumberSquarer {
    public List<Integer> squareValues(List<Integer> nums) {
        nums.replaceAll(n -> n * n);
        return nums;
    }
}