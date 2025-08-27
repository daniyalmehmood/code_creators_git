//Array-2 > centeredAverage
public class ArrayStatistics {
    public int calculateCenteredAverage(int[] nums) {
        int sum = 0;
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (nums[i] < small) {
                small = nums[i];
            }
            if (nums[i] > large) {
                large = nums[i];
            }
        }

        sum = sum - small - large;
        return sum / (nums.length - 2);
    }
}
