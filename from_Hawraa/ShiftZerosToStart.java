// Array-2 > zeroFront
public class ShiftZerosToStart {
    public int[] moveZeroToFront(int[] nums) {
        int zeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = nums[zeroIndex];
                nums[zeroIndex] = 0;
                zeroIndex++;
            }
        }
        return nums;
    }
}
