public class ClumpedGroupSum {
    public boolean canSumWithClumps(int start, int[] nums, int target) {
        if (target == 0) {
            return true;
        } else if (start >= nums.length) {
            return false;
        } else {
            int end = start;
            while (end < nums.length && nums[end] == nums[start]) end++;
            int length = end - start;
            return canSumWithClumps(end, nums, target) || canSumWithClumps(end, nums, target - nums[start] * length);
        }
    }

}

