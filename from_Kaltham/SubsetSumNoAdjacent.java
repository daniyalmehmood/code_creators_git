//Recursion-2 > groupNoAdj


public class SubsetSumNoAdjacent {
    public boolean canAchieveTargetNoAdjacent(int start, int[]nums, int target) {

        if (start >= nums.length) {
            return target == 0;
        }

        if (canAchieveTargetNoAdjacent(start + 2, nums, target - nums[start])) {
            return true;
        }

        if (canAchieveTargetNoAdjacent(start + 1, nums, target)) {
            return true;
        }

        return false;
    }
}