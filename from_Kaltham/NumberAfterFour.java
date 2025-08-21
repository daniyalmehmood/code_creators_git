public class NumberAfterFour {
    public int[]placeFiveAfterFour(int[]nums) {
        int numberAterFour = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                if (nums[i + 1] == 5) {
                    continue;
                }
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 5 && (j == 0 || nums[j - 1] != 4)) {
                        numberAterFour = nums[i + 1];
                        nums[i + 1] = 5;
                        nums[j] = numberAterFour;
                        break;
                    }

                }
            }

        }
        return nums;
    }
}