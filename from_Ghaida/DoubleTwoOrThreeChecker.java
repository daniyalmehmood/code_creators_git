public class DoubleTwoOrThreeChecker {
    public static void main(String[] args) {
        System.out.println(hasDoubleTwoOrThree(new int[]{2, 2})); // true
        System.out.println(hasDoubleTwoOrThree(new int[]{3, 3})); // true
        System.out.println(hasDoubleTwoOrThree(new int[]{2, 3})); // false
    }

    /**
     * Returns true if the array has length 2 and both elements are 2 or both are 3.
     */
    public static boolean hasDoubleTwoOrThree(int[] nums) {
        if (nums == null || nums.length != 2) {
            return false;
        }
        return (nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3);
    }
}
