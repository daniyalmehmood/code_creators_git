//Functional-1 > square

import java.util.List;

public class SquareValues {
    public List<Integer> squareAllElements(List<Integer> nums) {
        nums.replaceAll(n -> n * n);
        return nums;
    }
}