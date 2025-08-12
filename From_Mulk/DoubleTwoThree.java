public class DoubleTwoThree {
    public boolean hasDoubleTwoOrDoubleThree(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        if (nums.length <= 1 && (nums[0] == 2 || nums[0] == 3)) {
            return false;
        }
        if (nums.length > 1 && ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3))) {
            return true;
        }
        return false;
    }

}