public class ArrayShifter {
    public int[]shiftLeft(int[]nums) {
        int[]newArray = new int[nums.length];
        if (nums.length <= 1) {
            return nums;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            newArray[i] = nums[i + 1];

        }
        newArray[nums.length - 1] = nums[0];
        return newArray;
    }
}