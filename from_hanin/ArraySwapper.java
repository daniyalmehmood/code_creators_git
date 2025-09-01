public class ArraySwapper {
    public int[] swapFirstAndLast(int[] nums) {
        // Save the last element in new array
        int lastElement = nums[nums.length - 1];
        nums[nums.length - 1] = nums[0];
        nums[0] = lastElement;
        // Step 4: Return array
        return nums;
    }
}

