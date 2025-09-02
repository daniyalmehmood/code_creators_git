//Functional-2 > square56

import java.util.List;

public class SquareFilter {
    public List<Integer> squareAddTenAndRemoveEndingInFiveOrSix(List<Integer> nums) {
        nums.replaceAll(n -> n * n);
        nums.replaceAll(n -> n + 10);
        nums.removeIf(n -> n % 10 == 5 || n % 10 == 6);
        return nums;
    }

}