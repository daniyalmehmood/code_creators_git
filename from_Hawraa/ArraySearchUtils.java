// Recursion-1 > array6
public class ArraySearchUtils {
    public boolean hasSixFromIndex(int[] nums, int index) {
        if (index >= nums.length) {
            return false;
        }
        if (nums[index] == 6) {
            return true;
        }
        return hasSixFromIndex(nums, index + 1);
    }
}