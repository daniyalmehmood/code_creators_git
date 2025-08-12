public class UnluckyOne {
    public boolean hasSequenceOneThree(int[]nums) {
        if (nums.length >= 2) {
            if ((nums[0] == 1 && nums[0 + 1] == 3) || (nums[0 + 1] == 1 && nums[0 + 2] == 3) ||
                (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3)) {
                return true;
            }
        }
        return false;
    }
}