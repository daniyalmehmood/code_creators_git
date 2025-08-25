public class FirstLastArrayBuilder {
    // This class provides a method to return a new array with the first and last elements of the input array
    public int[] makeNewArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int[] ints = new int[]{nums[0], nums[nums.length - 1]};
            return ints;
        }
        return nums;
    }
}

