public class ArraySum {
    public static int sum3(int[] nums) {
        int sum = 0;
        // Loop through each element and add it to sum
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
