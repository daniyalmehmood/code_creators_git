public class MoveZeros {
    public int[]moveZerosToFront(int[]nums) {
        int[]newArray = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                newArray[index] = nums[i];
                index++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                newArray[index] = nums[i];
                index++;
            }
        }
        return newArray;
    }
}