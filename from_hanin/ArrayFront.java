public class ArrayFront {
    public int[] toGetFrontTwo(int[] nums) {
        // Step 1: Check if array has at least two elements
        if (nums.length >= 2) {
            // Step 2: Return a new array with the first two elements
            return new int[]{nums[0], nums[1]};
        } else {
            // Step 3: return array
            return nums;
        }
    }
}


