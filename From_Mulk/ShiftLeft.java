//Array-2 > shiftLeft
public class ShiftLeft {
    public int[] circularShiftLeftByOne(int[] nums) {
        if (nums.length <= 0)
            return nums;
        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i++) {
            newArray[i] = nums[i + 1];
        }
        newArray[nums.length - 1] = nums[0];

        return newArray;
    }
}