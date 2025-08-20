public class GroupSumNoAdjacent {//Recursion-2 > groupNoAdj
    public static void main(String[] args) {
        System.out.println(canReachTargetNoAdjacent(0, new int[]{2, 5, 10, 4}, 12));// → true
        System.out.println(canReachTargetNoAdjacent(0, new int[]{2, 5, 10, 4}, 14));// → false
        System.out.println(canReachTargetNoAdjacent(0, new int[]{2, 5, 10, 4}, 7));// → false
    }
    public static boolean canReachTargetNoAdjacent(int start, int[] nums, int target) {
        if(start >= nums.length){
            return target == 0;
        }
        else if(canReachTargetNoAdjacent(start + 2, nums, target - nums[start])){
            return true;//Include nums[start] in the group
        }
        else if(canReachTargetNoAdjacent(start + 1, nums, target)){
            return true;//Exclude nums[start] from the group
        }
        return false;
    }
}