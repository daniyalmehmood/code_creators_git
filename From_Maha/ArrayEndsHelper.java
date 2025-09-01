public class ArrayEndsHelper {
    public static int[] makeEnds(int[] nums) {
        return new int[] { nums[0], nums[nums.length - 1] };
    }
}
