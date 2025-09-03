// Recursion-1 > array11
public class ArrayElevensCounter {
    public int countElevens(int[] nums, int index) {
        if (index >= nums.length) {
            return 0;
        }
        if (nums[index] == 11) {
            return 1 + countElevens(nums, index + 1);
        }
        return countElevens(nums, index + 1);
    }
}