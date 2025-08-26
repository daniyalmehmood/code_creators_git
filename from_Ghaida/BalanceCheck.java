public class BalanceCheck {//Array-3 > canBalance
    public static void main(String[] args) {
        System.out.println(isSplitEqual(new int[]{1, 1, 1, 2, 1}));// → true
        System.out.println(isSplitEqual(new int[]{2, 1, 1, 2, 1}));// → false
        System.out.println(isSplitEqual(new int[]{10, 10}));// → true
    }
    public static boolean isSplitEqual(int[] nums) {
        int totalSum = 0;
        for (int numbers : nums) {//sum all values
            totalSum += numbers;
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            leftSum += nums[i];
            if (leftSum * 2 == totalSum) {
                return true;
            }
        }
        return false;
    }
}