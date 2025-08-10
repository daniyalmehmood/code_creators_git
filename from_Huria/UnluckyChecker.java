public class UnluckyChecker {
    public static boolean unluckyOne(int[] nums) {
        if (nums.length >= 2) {
            if ((nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3) || (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(unluckyOne(new int[]{1, 3, 4, 5}));
        System.out.println(unluckyOne(new int[]{2, 1, 3, 4, 5}));
        System.out.println(unluckyOne(new int[]{1, 1, 1}));
        System.out.println(unluckyOne(new int[]{1}));
        System.out.println(unluckyOne(new int[]{}));
    }
}