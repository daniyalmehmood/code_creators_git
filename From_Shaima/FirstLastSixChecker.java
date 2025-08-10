public class FirstLastSixChecker {
    public static boolean isFirstOrLastSix(int[] nums) {
        if (nums[0]==6 || nums[nums.length-1] ==6){ // check the first and last element is it 6
            return true; // one of them or both is 6
        }
        return false; // no 6 in the first or last position
    }
   public  static void main (String[] args) {
    System.out.println(isFirstOrLastSix(new int[]{1, 2, 6}));
    System.out.println(isFirstOrLastSix(new int[]{13, 6, 1, 2, 3}));
    }
}