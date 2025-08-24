public class CenteredAverage {
    public int calculateCenteredAverage(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
            sum += nums[i];
        }

        if (nums.length >= 3) {
            sum = sum - max - min;
            return sum / (nums.length - 2);
        }

        return 0;
    }

}