import java.util.List;

public class SquareCalculator {
    public List<Integer> getSquared(List<Integer> nums) {
        nums.replaceAll(n -> n * n);
        return nums;
    }
}
