public class MaxEdgeThree {

    public int[] findMaxEdge(int[] nums) {
        // Check  first element is greater than the last
        if (nums[0] > nums[2]) {
            return new int[]{nums[0], nums[0], nums[0]};
        }

        // Check if the last element is greater than the first
        if (nums[2] > nums[0]) {
            return new int[]{nums[2], nums[2], nums[2]};
        }

        // If both are equal, return the original array
        return nums;
    }

}
