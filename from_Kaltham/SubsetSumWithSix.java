//Recursion-2 > groupSum6

public class SubsetSumWithSix {
    public boolean canAchieveTargetWithSix(int start, int[]nums, int target) {

        if (start >= nums.length) {
            return target == 0;
        }

        if (nums[start] == 6) {
            return canAchieveTargetWithSix(start + 1, nums, target - 6);
        }

        if (canAchieveTargetWithSix(start + 1, nums, target - nums[start])) {
            return true;
        }

        if (canAchieveTargetWithSix(start + 1, nums, target)) {
            return true;
        }

        return false;
    }
}