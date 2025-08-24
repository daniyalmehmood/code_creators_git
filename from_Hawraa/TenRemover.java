// Array-2 > withoutTen
public class TenRemover {
    public int[] withoutTen(int[] nums) {
        int nextIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                nums[nextIndex] = nums[i];
                nextIndex++;
            }
        }
        for (int i = nextIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums;
    }
}
