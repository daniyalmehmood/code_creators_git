import java.util.List;

public class MathOperation {
    public List<Integer> addingOneToArrayElementAndMultiplyWithTen(List<Integer> nums) {
        nums.replaceAll(num -> (num + 1) * 10);
        return nums;
    }

}
