import java.util.List;

public class IntegerMultiplier {
    public List<Integer> getDoubled(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }
}
