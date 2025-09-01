public class CheckIfTwosSumToEight {
    public static boolean isSumOfAllTwosEqualToEight(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                count += 2;
            }
        }
        if (count == 8) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSumOfAllTwosEqualToEight(new int[]{2, 3, 2, 2, 4, 2}));
        System.out.println(isSumOfAllTwosEqualToEight(new int[]{2, 3, 2, 2, 4, 2, 2}));
        System.out.println(isSumOfAllTwosEqualToEight(new int[]{1, 2, 3, 4}));
    }
}