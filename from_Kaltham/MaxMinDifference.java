public class MaxMinDifference {
    public int calculateMaxMinDifference(int[]nums) {
        int maxNumber = nums[0];
        int minNumber = nums[0];
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            maxNumber = Math.max(maxNumber, nums[i]);
            minNumber = Math.min(minNumber, nums[i]);
        }
        return result = maxNumber - minNumber;

    }
}