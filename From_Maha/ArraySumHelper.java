public class ArraySumHelper {
    public static int sumFirstTwo(int[] nums) {
        if (nums.length == 0) {
            return 0; // No elements to sum
        }
        if (nums.length == 1) {
            return nums[0]; // Only one element, return it
        }
        return nums[0] + nums[1]; // Sum the first two elements
    }
}
