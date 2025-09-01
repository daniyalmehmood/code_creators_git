//
public class SixFinder {
    public static boolean containsSix(int[] nums, int index) {
        if (index == nums.length) {
            return false;
        }
        if (nums[index] == 6) {
            return true;
        }
        return containsSix(nums, index + 1);
    }
}
