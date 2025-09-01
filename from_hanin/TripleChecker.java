public class TripleChecker {
    public static boolean hasNoTriples(int[] nums) {
        // stopping 2 elements before the end
        for (int i = 0; i < nums.length - 2; i++) {
            // Check if current element and the next two are the same
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                return false; // Triple found
            }
        }
        return true; // No triples found
    }
}
