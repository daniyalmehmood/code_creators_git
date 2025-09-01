//Array-2 > isEverywhere
public class ValuePresenceChecker {
    public static boolean isValueEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length - 1; i++) {
            // check nums[i] and nums[i + 1]
            if (nums[i] != val && nums[i + 1] != val) {
                return false;
                // This pair does NOT contain the value -> return false
            }

        }
        return true;
    }

}
