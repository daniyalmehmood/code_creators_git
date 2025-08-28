public class ArrayExtractor {
    public int[] elementsBeforeFour(int[] nums) {
        int indexOfFour = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                indexOfFour = i;
                break; // stop at the first 4
            }
        }
        int[] result = new int[indexOfFour];
        for (int j = 0; j < indexOfFour; j++) {
            result[j] = nums[j];
        }
        return result;
    }
}
