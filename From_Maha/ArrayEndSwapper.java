public class ArrayEndSwapper {
//Swaps the first and last elements of the array if its length is at least 2.
    public static int[] swapFirstAndLast(int[] nums) {
        if (nums.length >= 2) {
            int first = nums[0];
            nums[0] = nums[nums.length - 1];
            nums[nums.length - 1] = first;
        }
        return nums;
    }
}
