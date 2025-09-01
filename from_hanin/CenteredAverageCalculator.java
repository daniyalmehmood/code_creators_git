//Array-2 > centeredAverage
public class CenteredAverageCalculator {
    public int calculateCenteredAverage(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int sum = nums[0]; // start sum with first element

        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
            sum += nums[i];
        }

        int adjustedSum = sum - min - max; // subtract smallest and largest once each
        return adjustedSum / (nums.length - 2); // integer division for average
    }
}
