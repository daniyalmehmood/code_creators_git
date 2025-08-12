public class MaxTriple {
    public int maxTriple(int[]nums) {
        int max = nums[0];
        if (nums[0] < nums[nums.length - 1]) {
            max = nums[nums.length - 1];
        }
        if (max < nums[nums.length / 2]) {
            max = nums[nums.length / 2];
        }
        return max;
    }
}