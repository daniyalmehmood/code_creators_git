public class ComputeMiddleAverage {
    public static int calculateCenteredAverage(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        sum = sum - min - max;
        return sum / (nums.length - 2);
    }

    public static void main(String[] args) {
        System.out.println(calculateCenteredAverage(new int[]{1, 2, 3, 4, 100}));
        System.out.println(calculateCenteredAverage(new int[]{1, 1, 5, 5, 10, 8, 7}));
        System.out.println(calculateCenteredAverage(new int[]{-10, -4, -2, -4, -2, 0}));
    }
}