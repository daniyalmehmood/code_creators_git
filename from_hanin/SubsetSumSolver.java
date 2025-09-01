public class SubsetSumSolver {
    public static boolean groupSum(int start, int[] nums, int target) {
        if (target == 0) {
            return true;
        } else if (start == nums.length) {
            return false;
        } else {
            return groupSum(start + 1, nums, target - nums[start]) || groupSum(start + 1, nums, target);
        }

    }

}
