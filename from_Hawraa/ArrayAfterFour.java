// Array-2 > post4
public class ArrayAfterFour {
    public int[] getAfterFourElements(int[] nums) {
        int lastIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                lastIndex = i;
            }
        }
        int[] result = new int[nums.length - lastIndex - 1];
        for (int i = lastIndex + 1; i < nums.length; i++) {
            result[i - lastIndex - 1] = nums[i];
        }
        return result;
    }
}
