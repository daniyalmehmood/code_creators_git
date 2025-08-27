public class GroupSplitter {
    public boolean groupSplitter(int[] nums) {
        return splitHelper(0, 0, 0, nums);
    }

    private boolean splitHelper(int i, int a, int b, int[] nums) {
        if (i >= nums.length) {
            return (a % 10 == 0 && b % 2 == 1) || (b % 10 == 0 && a % 2 == 1);
        } else {
            if (nums[i] % 5 == 0) {
                return splitHelper(i + 1, a + nums[i], b, nums);
            } else if (nums[i] % 3 == 0) {
                return splitHelper(i + 1, a, b + nums[i], nums);
            } else {
                return splitHelper(i + 1, a, b + nums[i], nums) || splitHelper(i + 1, a + nums[i], b, nums);
            }
        }
    }

}

