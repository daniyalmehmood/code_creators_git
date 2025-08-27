public class GroupSumFiveSolver {
    // All multiples of 5 must be included,and if followed by 1, that 1 must be skipped.
    public static boolean groupSumFive(int start, int[] nums, int target) {
        if (start >= nums.length) return target == 0;

        if (nums[start] % 5 == 0) {
            if (start + 1 < nums.length && nums[start + 1] == 1)
                return groupSumFive(start + 2, nums, target - nums[start]);
            return groupSumFive(start + 1, nums, target - nums[start]);
        }

        return groupSumFive(start + 1, nums, target - nums[start]) || groupSumFive(start + 1, nums, target);
    }

    public static void main(String[] args) {
        System.out.println(groupSumFive(0, new int[]{2,5,10,4}, 19));
        System.out.println(groupSumFive(0, new int[]{2,5,10,4,1}, 17));
        System.out.println(groupSumFive(0, new int[]{2,5,10,4,1}, 12));
    }
}