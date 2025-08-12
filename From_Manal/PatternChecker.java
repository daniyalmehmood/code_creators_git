public class PatternChecker {
    // This Function to check if array has a 271 pattern
    public static  boolean hasTwoSevenOnePattern(int[] nums) {
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i] ==2 && nums[i + 1] == 7 && nums[i+2] == 1) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] arg) {
        System.out.println(hasTwoSevenOnePattern(new int[]{1, 2, 7, 1}));
        System.out.println(hasTwoSevenOnePattern(new int[]{1, 2, 8, 1}));
        System.out.println(hasTwoSevenOnePattern(new int[]{2, 7, 1}));
    }
    }