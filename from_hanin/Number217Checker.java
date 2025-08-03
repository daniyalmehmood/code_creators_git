// Class to check for a specific 271 pattern in an integer array
public class Number217Checker {
    public static boolean itHas2Or7Or1(int[] nums) {
        // Loop through array until the third-last element
        for (int i = 0; i < nums.length - 2; i++) {

            // Check if the second number is 5 more than the first
            if (nums[i + 1] == nums[i] + 5) {
                
                if (Math.abs(nums[i + 2] - (nums[i] - 1)) <= 2) {
                    return true;
                }
            }
        }
        return false; // Pattern not found
    }
}
