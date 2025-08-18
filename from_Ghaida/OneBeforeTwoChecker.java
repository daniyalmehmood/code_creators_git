public class OneBeforeTwoChecker {//Array-2 > has12
    public static void main(String[] args) {
        System.out.println(hasOneBeforeTwo(new int[]{1, 2, 3}));// → true
        System.out.println(hasOneBeforeTwo(new int[]{3, 2, 1}));// → false
        System.out.println(hasOneBeforeTwo(new int[]{3, 1, 4, 5, 2}));// → true
    }
    public static boolean hasOneBeforeTwo(int[] nums) {
        boolean foundTwoAfterOne = false;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                foundTwoAfterOne =  true;
            }
            if(foundTwoAfterOne && nums[i] == 2){
                return true;
            }
        }
        return false;
    }
}