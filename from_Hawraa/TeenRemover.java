// Functional-2 > noTeen

import java.util.List;

public class TeenRemover {
    public List<Integer> removeTeenValues(List<Integer> nums) {
        nums.removeIf(n -> n >= 13 && n <= 19);
        return nums;
    }
}