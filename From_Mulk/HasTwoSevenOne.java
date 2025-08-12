public class Has271 {
    public boolean detect271Sequence(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {  // stop at second last element
            if (nums[i + 1] == nums[i] + 5 &&
                    Math.abs(nums[i + 2] - (nums[i] - 1)) <= 2) {
                return true;
            }
        }
        return false;
    }
}