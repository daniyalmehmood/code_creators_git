public class GroupSumMustIncludeFives {//Recursion-2 > groupSum5
    public static void main(String[] args) {
        System.out.println(canReachTargetWithFivesRule(0, new int[]{2, 5, 10, 4}, 19));// → true
        System.out.println(canReachTargetWithFivesRule(0, new int[]{2, 5, 10, 4}, 17));// → true
        System.out.println(canReachTargetWithFivesRule(0, new int[]{2, 5, 10, 4}, 12));// → false
    }

    public static boolean canReachTargetWithFivesRule(int start, int[] nums, int target) {
        if(start >= nums.length){
            return target == 0;
        }
        else if(nums[start] % 5 == 0) {
            if (start + 1 < nums.length && nums[start + 1] == 1) {
                return canReachTargetWithFivesRule(start + 2, nums, target - nums[start]);
            }
            return canReachTargetWithFivesRule(start + 1, nums, target - nums[start]);
        }
        return canReachTargetWithFivesRule(start + 1, nums, target - nums[start]) ||
                canReachTargetWithFivesRule(start + 1, nums, target);
    }
}