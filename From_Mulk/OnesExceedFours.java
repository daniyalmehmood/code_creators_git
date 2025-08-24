public class OnesExceedFours {
    public boolean moreOnesThanFours(int[] nums) {
        int countOne = 0;
        int countFour = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                countOne++;
            }
            if (nums[i] == 4) {
                countFour++;

            }
        }
        return countOne > countFour;
    }
}



