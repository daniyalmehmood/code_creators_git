public class NumberChecker {
    public boolean hasTwoThree(int[]nums) {
        if (nums[0] == 2 || nums[0] == 3) {
            return true;
        } else if (nums[1] == 2 || nums[1] == 3) {
            return true;
        }
        return false;
    }
}