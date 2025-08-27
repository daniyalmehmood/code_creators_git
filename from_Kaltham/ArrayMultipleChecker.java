//Recursion-1 > array220

public class ArrayMultipleChecker {
    public boolean hasTimesTen(int[]nums, int index) {
        if (nums.length - 2 < index) {
            return false;
        }
        if (nums[index] * 10 == nums[index + 1]) {
            return true;
        }

        return hasTimesTen(nums, index + 1);
    }
}