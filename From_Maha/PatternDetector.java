public class PatternDetector {
    public boolean hasSpecialPattern(int[] nums) {
        // Iterate through the array, stopping at length - 2 to prevent index out of bounds
        for (int i = 0; i < nums.length - 2; i++) {
            int x = nums[i]; // Base value to compare the pattern against
            // Check if the next two numbers match the pattern
            // Check if the second number is exactly 5 more than the base value (x)
            // Check if the third number is approximately x - 1 (within ±2)
            if (nums[i + 1] == x + 5 && (Math.abs(nums[i + 2] - (x - 1)) <= 2)) {
                return true;
            }
        }
        return false;

    }
}

