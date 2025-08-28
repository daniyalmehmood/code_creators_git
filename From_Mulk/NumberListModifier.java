//Functional-1 > math1

import java.util.List;

public class NumberListModifier {
    public List<Integer> addOneAndMultiplyByTen(List<Integer> nums) {
        nums.replaceAll(s -> s + 1);
        nums.replaceAll(s -> s * 10);

        return nums;
    }

}