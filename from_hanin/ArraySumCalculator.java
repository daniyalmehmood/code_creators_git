public class ArraySumCalculator {
    public static int sumOfThree(int[] nums) {
        int sum = 0;

        // Add each element to the sum
        for (int i = 0; i < nums.length; i++)
            sum += nums[i];

        return sum;
    }
}
