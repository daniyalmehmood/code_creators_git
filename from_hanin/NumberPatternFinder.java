//Array-2 > either24
public  class NumberPatternFinder {
    public  static boolean hasEitherDoubleTwoOrFour(int[] nums) {
        boolean has22 = false;
        boolean has44 = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i+1] == 2) {
                has22 = true;
            }
            if (nums[i] == 4 && nums[i+1] == 4) {
                has44 = true;
            }
            if (has22 && has44) {
                return false;
            }

        }
        return has22 || has44;
    }
}
