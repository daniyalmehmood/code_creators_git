//Functional-1 > doubling

import java.util.List;

public class DoubleValues {
    public List<Integer> applyDoublingToList(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }
}