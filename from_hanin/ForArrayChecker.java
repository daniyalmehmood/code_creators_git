// This class checks if the first and last elements of an integer array are the same
public class ForArrayChecker {
    public boolean hasSameStartAndEnd(int[] nums) {
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // Compare the first and last elements
            if (nums[0] == nums[nums.length - 1]) {
                return true;
            }
        }
        // If not equal, return false
        return false;
    }
}
