public class ConsecutiveSequenceChecker {
    public boolean hasTripleIncreasingSequence(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] == nums[i] + 1 && nums[i + 2] == nums[i] + 2) {
                return true; // found a triple increasing sequence
            }
        }
        return false;
    }
}
