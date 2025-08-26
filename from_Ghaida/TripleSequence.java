public class TripleSequence {//Array-2 > tripleUp
    public static void main(String[] args) {
        System.out.println(checkTripleIncreasing(new int[]{1, 4, 5, 6, 2}));// → true
        System.out.println(checkTripleIncreasing(new int[]{1, 2, 3}));// → true
        System.out.println(checkTripleIncreasing(new int[]{1, 2, 4}));// → false
    }
    public static boolean checkTripleIncreasing(int[] nums) {
        if(nums.length < 3){
            return false;
        }
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] == nums[i] + 1 && nums[i + 2] == nums[i + 1] + 1) {
                return true;
            }
        }
        return false;
    }
}