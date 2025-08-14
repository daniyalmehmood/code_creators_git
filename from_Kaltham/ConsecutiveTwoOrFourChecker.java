public class ConsecutiveTwoOrFourChecker {
    public boolean hasEitherConsecutiveTwoOrFour(int[]nums) {
        boolean hasConsecutiveTwos = false;
        boolean hasConsecutiveFours = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                hasConsecutiveTwos = true;
            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                hasConsecutiveFours = true;
            }
        }
        return hasConsecutiveTwos ^ hasConsecutiveFours;
    }
}