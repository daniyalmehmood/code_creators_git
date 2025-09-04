public class GroupSumWithClumps {//Recursion-2 > groupSumClump
    public static void main(String[] args) {
        System.out.println(canReachTargetWithClumps(0, new int[]{2, 4, 8}, 10));// → true
        System.out.println(canReachTargetWithClumps(0, new int[]{1, 2, 4, 8, 1}, 14));// → true
        System.out.println(canReachTargetWithClumps(0, new int[]{2, 4, 4, 8}, 14));// → false
    }
    public static boolean canReachTargetWithClumps(int start, int[] nums, int target) {
        if(start >= nums.length){
            return target == 0;
        }
        int sumOfClump = nums[start];
        while (start + 1 < nums.length && nums[start + 1] == nums[start]) {
            sumOfClump += nums[start + 1];
            start++;
        }
        if (canReachTargetWithClumps(start + 1, nums, target - sumOfClump)) {
            return true;//include the clump
        }
        return canReachTargetWithClumps(start + 1, nums, target);//excluding the clump
    }
}