// Array-2 > tenRun
public class MultipleOfTenReplacer {
    public int[] replaceWithLastMultipleOfTen(int[] nums) {
        int currentMultiple = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                currentMultiple = nums[i];
            } else if (currentMultiple != -1) {
                nums[i] = currentMultiple;
            }
        }
        return nums;
    }
}
