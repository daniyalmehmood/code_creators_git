// Array-3 > fix45
public class FixAfterFour {
    public int[] fixFourFivePairs(int[] nums) {
        int fiveIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                if (nums[i + 1] == 5) {
                    continue;
                }
                while (fiveIndex < nums.length && nums[fiveIndex] != 5 || (fiveIndex > 0 && nums[fiveIndex - 1] == 4)) {
                    fiveIndex++;
                }
                int afterFour = nums[i + 1];
                nums[i + 1] = nums[fiveIndex];
                nums[fiveIndex] = afterFour;
            }
        }
        return nums;
    }
}