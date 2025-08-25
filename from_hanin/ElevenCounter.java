public class ElevenCounter {
    public static int countElevens(int[] nums, int index) {
        if (index == nums.length) {
            return 0;
        } else {
            if (nums[index] == 11) {
                return 1 + countElevens(nums, index + 1);
            } else {
                return countElevens(nums, index + 1);
            }
        }
    }

}
