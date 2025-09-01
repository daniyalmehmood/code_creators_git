public class LuckyArrayValidator {
    public static boolean isLuckyArray(int[] nums) {
        for (int i=0 ; i<nums.length ; i++){
            if (nums[i] ==1 || nums[i]==3){ // check the element in the array
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isLuckyArray(new int[]{1, 2, 4}));
    }
}
