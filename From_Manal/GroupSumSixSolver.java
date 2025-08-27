public class GroupSumSixSolver {
    public static boolean groupSumsix(int start, int[] nums, int target) {
        if (start >= nums.length) return target == 0;

        if (nums[start] == 6)
            return groupSumsix(start + 1, nums, target - nums[start]);

        return groupSumsix(start + 1, nums, target - nums[start]) || groupSumsix(start + 1, nums, target);
    }

    public static void main(String[] args) {
        System.out.println(groupSumsix(0, new int[]{5,6,2}, 13));
        System.out.println(groupSumsix(0, new int[]{5,6,2}, 9));
        System.out.println(groupSumsix(0, new int[]{5,6,2}, 7));
    }
}