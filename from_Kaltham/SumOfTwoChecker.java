public class SumOfTwoChecker {
    public boolean hasOfTwosIsEight(int[]nums) {
        int sumOfTwos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                sumOfTwos += nums[i];
            }
        }
        return sumOfTwos == 8;
    }
}