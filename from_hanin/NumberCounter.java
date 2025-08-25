public class NumberCounter {
    public static int countNines(int[] nums) {
        int count = 0;

        // pass through each number in the array
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];

            // Check if current number is 9
            if (n == 9) {
                count++;
            }
        }

        // Return the total count of 9s found
        return count;
    }
}
