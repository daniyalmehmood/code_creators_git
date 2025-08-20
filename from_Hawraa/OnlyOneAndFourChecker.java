// Array-2 > only14
public class OnlyOneAndFourChecker {
    public static boolean onlyOneAndFour(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[]args){
        System.out.println(onlyOneAndFour(new int[]{1, 4, 1, 4}));
        System.out.println(onlyOneAndFour(new int[]{1, 4, 2, 4}));
        System.out.println(onlyOneAndFour(new int[]{1, 1}));
    }
}
