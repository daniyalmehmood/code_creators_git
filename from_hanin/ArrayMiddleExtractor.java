public class ArrayMiddleExtractor {
    public int[] toFindMiddleThree(int[] nums) {

        // Step 1: find  the middle index
        int mid = nums.length / 2;

        // Step 2: Return a new array with the middle element
        return new int[]{nums[mid - 1], nums[mid], nums[mid + 1]};
    }
}

