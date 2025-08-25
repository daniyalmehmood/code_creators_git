// Array-3 > canBalance
public class BalanceArray {
    public boolean canBeBalanced(int[] nums) {
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            leftSum += nums[i];
            int rightSum = totalSum - leftSum;
            if (rightSum == leftSum) {
                return true;
            }
        }
        return false;
    }
}