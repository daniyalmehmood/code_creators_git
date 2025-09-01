public class ArrayExtractor {
    public int[] findMiddleTwo(int[] nums) {
        // Step 1: Find the middle index
        int mid = nums.length / 2;
        // Step 2: Return a new array with the two middle elements
        return new int[]{nums[mid - 1], nums[mid]};
    }
}
