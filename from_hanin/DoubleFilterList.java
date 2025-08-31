import java.util.List;

public class DoubleFilterList {
    public List<Integer> doubleAndFilter(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        nums.removeIf(n -> n % 10 == 2);
        return nums;
    }
}
