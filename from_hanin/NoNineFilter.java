import java.util.List;

public class NoNineFilter {
    public List<Integer> removeEndingNine(List<Integer> nums) {
        nums.removeIf(s -> (s % 10) == 9);
        return nums;
    }


}
