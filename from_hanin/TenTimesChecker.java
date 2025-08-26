public class TenTimesChecker {
    public boolean hasTenTimesPair(int[] nums, int index) {
        if (nums.length <= 1) {
            return false;
        }
        if (nums.length - 1 == index) {
            return false;
        } else {
            if (nums[index] * 10 == nums[index + 1]) {
                return true;
            } else {
                return hasTenTimesPair(nums, index + 1);
            }
        }
    }

}

