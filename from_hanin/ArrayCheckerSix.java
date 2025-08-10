public class ArrayCheckerSix {
    public static boolean isFirstOrLastSix(int[] nums) {
        // Loop through the array (loop is unnecessary but kept as-is)
        for (int i = 0; i < nums.length; i++) {
            // Check if the first or last element is 6
            if (nums[0] == 6 || nums[nums.length - 1] == 6) {
                return true;
            }
        }

        // Return false if neither the first nor last element is 6
        return false;
    }
}
