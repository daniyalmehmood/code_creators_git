public class FixThreeFour {

    public int[] fixThreeFourOrder(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 4 && (j == 0 || nums[j - 1] != 3)) {
                        int temp = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }
        return nums;
    }

}
