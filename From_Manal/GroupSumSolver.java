public class GroupSumSolver {
    public static boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length) return target == 0;

        // include current number
        if (groupSum(start + 1, nums, target - nums[start]))
            return true;

        // skip current number
        if (groupSum(start + 1, nums, target))
            return true;

        return false;
    }

    public static void main(String[] args) {
        System.out.println(groupSum(0, new int[]{2,4,8}, 10));
        System.out.println(groupSum(0, new int[]{2,4,8}, 14));
        System.out.println(groupSum(0, new int[]{2,4,8}, 9));
    }
}