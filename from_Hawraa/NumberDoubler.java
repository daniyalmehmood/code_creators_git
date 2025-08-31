// Functional-1 > doubling

import java.util.List;

public class NumberDoubler {
    public List<Integer> doubleValues(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }
}