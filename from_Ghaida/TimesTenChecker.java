public class TimesTenChecker {//Recursion-1 > array220
    public static void main(String[] args) {
        System.out.println(hasTimesTenPair(new int[]{1, 2, 20}, 0));// → true
        System.out.println(hasTimesTenPair(new int[]{3, 30}, 0));// → true
        System.out.println(hasTimesTenPair(new int[]{3}, 0));// → false
    }
    public static boolean hasTimesTenPair(int[] nums, int index) {
        if(index >= nums.length - 1){
            return false;
        }
        if(nums[index + 1] == nums[index] * 10){
            return true;
        }
        return hasTimesTenPair(nums, index + 1);
    }
}