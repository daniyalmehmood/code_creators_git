public class ValueEverywhereChecker {
    public boolean isValueEverywhere(int[]nums, int val) {
        if (nums.length <= 1) {
            return true;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val) {
                return false;
            }
        }
        return true;
    }
}