//Array-2 > bigDiff
public class  ArrayOperations  {
    public int calculateMaxMinDifference(int[] nums) {
        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        // Find the smallest number
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < small) {
                small = nums[i];
            }
        }
        // Find the largest number
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > large) {
                large = nums[j];
            }
        }
        return large - small;
    }
}
