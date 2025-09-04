public class GroupSumChecker {//Recursion-2 > groupSum
    public static void main(String[] args) {
        System.out.println(canReachTarget(0, new int[]{2, 4, 8}, 10));//true
        System.out.println(canReachTarget(0, new int[]{2, 4, 8}, 14));//true
        System.out.println(canReachTarget(0, new int[]{2, 4, 8}, 9));//false
    }
    public static boolean canReachTarget(int start, int[] nums, int target) {
        if (start == nums.length) {
            return target == 0;
        }
        else if(canReachTarget(start + 1, nums, target - nums[start])){
            return true;
        }
        else if(canReachTarget(start + 1, nums, target)){
            return true;
        }
        return false;

    }
}