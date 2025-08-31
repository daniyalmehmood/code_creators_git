import java.util.List;

public class DigitProcessor {
    public List<Integer> rightDigitList(List<Integer> nums) {
        nums.replaceAll(s -> s % 10);
        return nums;
    }

}
