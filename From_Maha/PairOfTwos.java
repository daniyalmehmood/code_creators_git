public class PairOfTwos {
    public boolean allTwosArePaired(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                boolean hasRightTwo = (i + 1 < nums.length && nums[i + 1] == 2);
                boolean hasLeftTwo = (i > 0 && nums[i - 1] == 2);

                if (!hasRightTwo && !hasLeftTwo) {
                    return false; // a single 2 without a pair
                }
            }
        }
        return true;
    }
}
