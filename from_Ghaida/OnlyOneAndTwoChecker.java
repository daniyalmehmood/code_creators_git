public class OnlyOneAndTwoChecker {//Array-2 > only14
    public static void main(String[] args) {
        System.out.println(hasOnlyOnesAndFours(new int[]{1, 4, 1}));// → true
        System.out.println(hasOnlyOnesAndFours(new int[]{1, 4, 1, 4}));// → false
        System.out.println(hasOnlyOnesAndFours(new int[]{1, 1}));// → true
    }
    public static boolean hasOnlyOnesAndFours(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 1 && nums[i] != 4){
                return false;
            }
        }
        return true;
    }
}