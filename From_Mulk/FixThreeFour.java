public class FixThreeFour {
    public int[] moveFoursAfterThrees(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                int result = nums[i + 1];
                nums[i + 1] = 4;
                for (int j = i + 2; j < nums.length; j++) {
                    if (nums[j] == 4) {
                        nums[j] = result;
                    }
                }
            }
        }
        return nums;
    }
}

