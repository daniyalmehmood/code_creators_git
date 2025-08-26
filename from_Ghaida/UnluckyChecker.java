public class UnluckyChecker {//Array-1 > unluckyChecker
    public static void main(String[] args) {
        System.out.println(hasUnluckyPattern(new int[]{1, 3, 4, 5}));// → true
        System.out.println(hasUnluckyPattern(new int[]{2, 1, 3, 4, 5}));// → true
        System.out.println(hasUnluckyPattern(new int[]{1, 1, 1}));// → false
    }
    public static boolean hasUnluckyPattern(int[] nums) {
        if(nums.length < 2){
            return false;
        }
        return nums[0] == 1 && nums[1] == 3 || nums[1] == 1 && nums[2] == 3 || nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3;
    }
}
