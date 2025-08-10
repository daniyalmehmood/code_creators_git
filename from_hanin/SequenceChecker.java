public class SequenceChecker {
    public static boolean contains123Sequence(int[] nums) {
        // Loop until the third-last element
        for (int i = 0; i < nums.length - 2; i++) {
            // Check if the current and next two elements are 1, 2, 3
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;  // Sequence not found
    }
}
