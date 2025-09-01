public class EvenNumberCollector {
    public int[] getFirstNEvens(int[] nums, int count) {
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == index) {
                break;
            }
            if (nums[i] % 2 == 0) {
                result[index] = nums[i];
                index++;
            }
        }
        return result;
    }

}
