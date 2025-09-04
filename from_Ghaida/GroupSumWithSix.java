public class GroupSumWithSix {//Recursion-2 > groupSum6

    public static void main(String[] args) {
        System.out.println(canReachTargetWithSixes(0, new int[]{5, 6, 2}, 8));//true
        System.out.println(canReachTargetWithSixes(0, new int[]{5, 6, 2}, 9));//false
        System.out.println(canReachTargetWithSixes(0, new int[]{5, 6, 2}, 7));//false
    }
    public static boolean canReachTargetWithSixes(int start, int[] nums, int target) {
        if (start == nums.length) {
            return target == 0;
        }
        if (nums[start] == 6) {
            return canReachTargetWithSixes(start + 1, nums, target - nums[start]);
        }
        return canReachTargetWithSixes(start + 1, nums, target - nums[start]) || canReachTargetWithSixes(start + 1, nums, target);
    }
}