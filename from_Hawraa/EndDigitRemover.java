// Functional-2 > no9

import java.util.List;

public class EndDigitRemover {
    public List<Integer> removeLastDigitNine(List<Integer> nums) {
        nums.removeIf(n -> n % 10 == 9);
        return nums;
    }
}