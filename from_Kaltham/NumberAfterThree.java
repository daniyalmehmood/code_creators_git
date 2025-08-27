public class NumberAfterThree {
    public int[]placeFoursAfterThrees(int[]nums) {
        int numberAter3 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 4 && (j == 0 || nums[j - 1] != 3)) {
                        numberAter3 = nums[i + 1];
                        nums[i + 1] = 4;
                        nums[j] = numberAter3;
                        break;
                    }

                }
            }

        }
        return nums;
    }
}