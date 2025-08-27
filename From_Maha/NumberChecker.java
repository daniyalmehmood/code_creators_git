//Array-2 > no14
public class NumberChecker {
    public boolean containsNoOneAndFourTogether(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == 1) {
                    if (nums[j] == 4) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
