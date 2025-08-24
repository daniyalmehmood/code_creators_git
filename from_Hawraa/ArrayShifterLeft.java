// Array-2 > shiftLeft
public class ArrayShifterLeft {
    public int[] shiftElementLeftOnce(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        int firstValue = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = firstValue;
        return nums;
    }
}
