//Array-2 > shiftLeft
public class ArrayShift {
    public static int[] rotateLeft(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }

        int first = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = first;

        return nums;
    }

}
