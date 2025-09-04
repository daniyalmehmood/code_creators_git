//Recursion-2 > groupSum5

public class SubsetSumWithFiveRule {
    public boolean canAchieveTargetWithFiveRule(int start, int[]nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }

        if (nums[start] % 5 == 0 && start + 1 < nums.length && nums[start + 1] == 1) {
            return canAchieveTargetWithFiveRule(start + 2, nums, target - nums[start]);

        }
        if ((nums[start] % 5 == 0 && start + 1 < nums.length && nums[start + 1] != 1) || (nums[start] % 5 == 0 && start == nums.length - 1)) {
            return canAchieveTargetWithFiveRule(start + 1, nums, target - nums[start]);
        }
        if (nums[start] % 5 != 0) {
            return canAchieveTargetWithFiveRule(start + 1, nums, target) || canAchieveTargetWithFiveRule(start + 1, nums, target - nums[start]);
        }
        return false;
    }
}