public class SumCalculator {
    public int sumExcludingSixToSeven(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                while (i < nums.length && nums[i] != 7) {
                    i++;
                }
                continue;

            }

            sum += nums[i];
        }

        return sum;
    }
}
