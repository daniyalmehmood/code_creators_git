public class SkipAdjacentPicker {
    public boolean isSumPossible(int start, int[] nums, int target) {
        if (target == 0) {
            return true;
        } else if (start >= nums.length) {
            return false;
        } else {
            return isSumPossible(start + 1, nums, target) || isSumPossible(start + 2, nums, target - nums[start]);
        }
    }

}
