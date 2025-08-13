public class ArrayMaxFinder {
    public int findMaxOfThree(int[] nums) {
        // Step 1: Store the (first,middle,last) element
        int first = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length - 1];
        // Step 2: Compare the (first,middle,last) element
        if (middle > first && middle > last) {
            return middle;
        }
        if (last > first && last > middle) {
            return last;
        }
        // Step 3: Return t
        return first;
    }
}

