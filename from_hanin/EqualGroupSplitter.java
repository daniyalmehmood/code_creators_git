public class EqualGroupSplitter {
    public boolean isBalancedSplit(int[] nums) {
        return checkSplit(0, 0, 0, nums);
    }

    private boolean checkSplit(int i, int a, int b, int[] nums) {
        if (i >= nums.length) {
            return a == b;
        } else {
            if (nums[i] % 5 == 0) {
                return checkSplit(i + 1, a + nums[i], b, nums);
            } else if (nums[i] % 3 == 0) {
                return checkSplit(i + 1, a, b + nums[i], nums);
            } else {
                return checkSplit(i + 1, a + nums[i], b, nums) || checkSplit(i + 1, a, b + nums[i], nums);
            }
        }
    }
}

