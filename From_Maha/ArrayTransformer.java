public class ArrayTransformer {
    public int[] propagateTens(int[] nums) {
        int lastMultipleOf10 = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                lastMultipleOf10 = nums[i];
            } else if (lastMultipleOf10 != -1) {
                nums[i] = lastMultipleOf10;
            }
        }
        return nums;
    }
}
