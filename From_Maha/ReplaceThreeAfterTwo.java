public class ReplaceThreeAfterTwo {
// Replaces any 3 that directly follows a 2 in a length-3 array with 0.
    public int[] replaceThreeAfterTwo(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }
        }
        return nums;
    }
}
