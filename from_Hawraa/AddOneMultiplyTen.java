// Functional-1 > math1

import java.util.List;

public class AddOneMultiplyTen {
    public List<Integer> addOneThenMultiplyByTen(List<Integer> nums) {
        nums.replaceAll(n -> (n + 1) * 10);
        return nums;
    }
}