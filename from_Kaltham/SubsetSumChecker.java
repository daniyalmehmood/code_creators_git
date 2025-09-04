//Recursion-2 > groupSum

public class SubsetSumChecker {
    public boolean canAchieveTarget(int start, int[]nums, int target) {

        if (start >= nums.length) {
            return target == 0;
        }
        if (canAchieveTarget(start + 1, nums, target - nums[start])) {
            return true;
        }

        if (canAchieveTarget(start + 1, nums, target)) {
            return true;
        }
        return false;
    }
}