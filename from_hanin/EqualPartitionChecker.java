public class EqualPartitionChecker {
    public boolean splitArray(int[] nums) {
        return splitHelper(0, 0, 0, nums);
    }

    public boolean splitHelper(int start, int sum1, int sum2, int[] nums) {
        if (start == nums.length) {
            return sum1 == sum2;
        }

        // Try putting nums[start] in group1
        if (splitHelper(start + 1, sum1 + nums[start], sum2, nums)) {
            return true;
        }

        // Try putting nums[start] in group2
        return splitHelper(start + 1, sum1, sum2 + nums[start], nums);
    }
}
