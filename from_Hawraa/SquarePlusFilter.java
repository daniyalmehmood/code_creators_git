// Functional-2 > square56

import java.util.List;

public class SquarePlusFilter {
    public List<Integer> squareAddTenFilterEnds(List<Integer> nums) {
        nums.replaceAll(n -> (n * n) + 10);
        nums.removeIf(n -> n % 10 == 5 || n % 10 == 6);
        return nums;
    }
}