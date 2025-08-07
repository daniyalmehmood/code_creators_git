public class NumberChecker {

    // Checks if the number 9 appears within the first 4 elements of the array.

    public boolean hasNineInFirstFour(int[] nums) {
        int bounds = Math.min(nums.length, 4); // Limit the loop to the first 4 elements (or less if array is smaller)
        for (int i = 0; i < bounds; i++) {
            if (nums[i] == 9) {
                return true; // 9 found within the first 4 elements
            }
        }
        return false; // 9 not found in the first 4 elements
    }
}
