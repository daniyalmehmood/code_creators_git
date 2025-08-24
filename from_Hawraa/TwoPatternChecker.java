// Array-2 > twoTwo
public class TwoPatternChecker {
    public boolean areAllTwosAdjacent(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 && !((i > 0 && nums[i - 1] == 2) || (i + 1 < nums.length && nums[i + 1] == 2))) {
                return false;
            }
        }
        return true;
    }
}
