public class ArrayBalanceChecker {
    public boolean canSplitArrayWithEqualSum(int[]nums) {
        boolean result = false;
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < nums.length; i++) {
            leftSum += nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                rightSum += nums[j];
            }
            if (leftSum == rightSum) {
                result = true;
                break;
            }
            rightSum = 0;

        }
        return result;
    }
}