public class ArrayValidator {
    public static boolean no23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 3) {
                return false; // Return false if 2 or 3 is found
            }
        }
        return true; // Return true if neither 2 nor 3 is present
    }
}
