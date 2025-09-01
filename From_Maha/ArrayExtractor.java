public class ArrayExtractor {
    public int[] elementsAfterLastFour(int[] nums) {
        int lastIndexOfFour = -1;
        // Find the last occurrence of 4
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                lastIndexOfFour = i;
                break;
            }
        }
        int[] result = new int[nums.length - lastIndexOfFour - 1];
        for (int i = lastIndexOfFour + 1; i < nums.length; i++) {
            result[i - lastIndexOfFour - 1] = nums[i];
        }
        return result;
    }
}
