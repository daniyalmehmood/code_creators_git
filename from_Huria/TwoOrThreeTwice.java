public class TwoOrThreeTwice {
    public static boolean doubleTwoOrThree(int[] nums) {
        if (nums.length > 1 && nums.length <= 2) {
            if ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(doubleTwoOrThree(new int[]{2, 2}));
        System.out.println(doubleTwoOrThree(new int[]{3, 3}));
        System.out.println(doubleTwoOrThree(new int[]{2, 3}));
        System.out.println(doubleTwoOrThree(new int[]{4, 5}));
        System.out.println(doubleTwoOrThree(new int[]{}));
        System.out.println(doubleTwoOrThree(new int[]{2}));
    }
}