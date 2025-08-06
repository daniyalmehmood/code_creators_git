public class SwapEnds {
    public int[] swapArrayEnds(int[] nums) {
        if (nums.length >= 2) {
            nums[0] = nums[0] + nums[nums.length - 1];
            nums[nums.length - 1] = nums[0] - nums[nums.length - 1];
            nums[0] = nums[0] - nums[nums.length - 1];
        }
        return nums;
    }
}