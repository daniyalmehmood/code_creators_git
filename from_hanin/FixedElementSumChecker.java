public class FixedElementSumChecker {
    public boolean validateSumPath(int start, int[] nums, int target) {
        if (start == nums.length) {
            if (target == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            if (nums[start] == 6) {
                return validateSumPath(start + 1, nums, target - nums[start]);
            } else {
                return validateSumPath(start + 1, nums, target) || validateSumPath(start + 1, nums, target - nums[start]);
            }

        }

    }

}


