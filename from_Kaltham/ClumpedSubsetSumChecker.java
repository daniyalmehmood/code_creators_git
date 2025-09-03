//Recursion-2 > groupSumClump


public class ClumpedSubsetSumChecker {
    public boolean canAchieveTargetWithClumps(int start, int[]nums, int target) {
        int sumClump = 0;
        int nextIndex = 0;
        if (start >= nums.length) {
            return target == 0;
        }

        for (int i = start; i < nums.length; i++) {
            if (nums[i] == nums[start]) {
                sumClump += nums[i];
            } else {
                nextIndex = i;
                break;
            }
        }

        if (nextIndex == 0) {
            nextIndex = nums.length;
        }

        if (canAchieveTargetWithClumps(nextIndex, nums, target - sumClump)) {
            return true;
        }

        if (canAchieveTargetWithClumps(nextIndex, nums, target)) {
            return true;
        }

        return false;
    }

}