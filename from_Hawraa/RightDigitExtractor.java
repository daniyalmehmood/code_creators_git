// Functional-1 > rightDigit

import java.util.List;

public class RightDigitExtractor {
    public List<Integer> getRightDigitOfEach(List<Integer> nums) {
        nums.replaceAll(n -> n % 10);
        return nums;
    }
}
