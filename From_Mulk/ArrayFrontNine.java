public class ArrayFrontNine {
    public boolean firstFourContains9(int[] nums) {
        for (int i = 0; i < Math.min(nums.length, 4); i++) {

            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }
}