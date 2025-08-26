public class ArrayUtils {

    public boolean isSameFirstAndLast(int[] nums) {
        if (nums.length == 0) {
            return false;
        } else return nums[0] == nums[nums.length - 1];
    }
}
