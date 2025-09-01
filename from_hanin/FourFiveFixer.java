//Array-3 > fix45
public class FourFiveFixer {
    public static int[] arrangeFourFive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 5 && (j == 0 || nums[j - 1] != 4)) {
                        // Swap the elements
                        int result = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = result;
                        break; // Break after swapping to avoid multiple swaps
                    }
                }
            }
        }
        return nums;
    }

}
