//Array-3 > fix45
public class ArrangeFourFive {
    public int[] rearrangeToFollowFourWithFive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 5 && i == 0 || nums[i] == 5 && nums[i - 1] != 4) {
                int result = i;
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 4 && nums[j + 1] != 5) {
                        int resultTow = nums[j + 1];
                        nums[j + 1] = 5;
                        nums[result] = resultTow;
                        break;
                    }
                }
            }
        }
        return nums;
    }
}