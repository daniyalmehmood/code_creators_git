public class ArrayCheck{
    public static boolean has23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 3) {
                return true; // Return true if either value is found
            }
        }
        return false; // Return false if neither value is found
    }
}
