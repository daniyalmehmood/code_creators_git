public class FirstElementChecker {
    public static boolean doesNotStartWith2Or3(int[] nums) {
        // Check if the first element is 2 or 3
        if (nums[0] == 2 || nums[0] == 3) {
            return false;
        }
        // Check if the second element is 2 or 3
        if (nums[1] == 2 || nums[1] == 3) {
            return false;
        }
        // Return true only if neither element is 2 or 3
        return true;
    }
}
