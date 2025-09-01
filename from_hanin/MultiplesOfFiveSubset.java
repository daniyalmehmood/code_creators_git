public class MultiplesOfFiveSubset {
    public boolean canSumWithRules(int start, int[] nums, int target) {
        if (start == nums.length) {
            return target == 0;
        }
        if (nums[start] % 5 == 0) {
            // Must include multiples of 5
            if (start + 1 < nums.length && nums[start + 1] == 1) {
                // Skip the 1 after a multiple of 5
                return canSumWithRules(start + 2, nums, target - nums[start]);
            } else {
                return canSumWithRules(start + 1, nums, target - nums[start]);
            }
        } else {

            return canSumWithRules(start + 1, nums, target) || canSumWithRules(start + 1, nums, target - nums[start]);
        }
    }

}

