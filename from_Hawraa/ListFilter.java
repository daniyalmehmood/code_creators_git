// Functional-2 > noNeg

import java.util.List;

public class ListFilter {
    public List<Integer> removeNegatives(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;
    }
}