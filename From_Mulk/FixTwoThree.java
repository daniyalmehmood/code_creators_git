public class FixTwoThree {
    public int[] replaceThreeFollowingTwo(int[] nums) {
        if (nums.length >= 3 && (nums[0] == 2 && nums[1] == 3)) {
            return new int[]{nums[0], 0, nums[2]};
        }
        if (nums.length >= 3 && (nums[1] == 2 && nums[2] == 3)) {
            return new int[]{nums[0], nums[1], 0};
        }
        return nums;
    }
}