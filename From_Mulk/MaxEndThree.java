public class MaxEndThree {
    public int[] maxEndFillThree(int[] nums) {
        if (nums.length >= 3 && (nums[0] > nums[2])) {
            return new int[]{nums[0], nums[0], nums[0]};
        }
        if (nums.length >= 3 && (nums[2] > nums[0])) {
        }
        return new int[]{nums[2], nums[2], nums[2]};
    }
}



