// Array-2 > has77
public class SevenPatternChecker {
    public static boolean hasCloseSevens(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 7 && nums[i + 1] == 7) {
                return true;
            }
            if (i < nums.length - 2 && nums[i] == 7 && nums[i + 2] == 7) {
                return true;
            }
        }
        return false;
    }

    public static void main (String[] args){
        System.out.println(hasCloseSevens(new int[]{1, 7, 7}));
        System.out.println(hasCloseSevens(new int[]{1, 7, 1, 7}));
        System.out.println(hasCloseSevens(new int[]{1, 7, 1, 1, 7}));
    }
}
