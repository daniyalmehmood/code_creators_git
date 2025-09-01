public class DoubleTwoChecker {
    public static boolean containsDoubleTwo(int[] nums) {
        for (int i=0 ; i< nums.length-1 ; i++){ // go through the array
            if (nums[i]==2 && nums[i+1]==2){ // is 2 followed by 2
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(containsDoubleTwo(new int[]{1, 2, 2}));
    }
}
