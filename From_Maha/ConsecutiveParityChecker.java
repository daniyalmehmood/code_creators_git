public class ConsecutiveParityChecker {
    public boolean hasThreeConsecutiveSameParity(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) {
                return true; // three evens in a row
            }
            if (nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 && nums[i + 2] % 2 != 0) {
                return true; // three odds in a row
            }
        }
        return false;
    }
}
