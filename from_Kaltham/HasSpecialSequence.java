public class HasSpecialSequence {
    public boolean hasSpecialSequence(int[]nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 5 == nums[i + 1] && Math.abs((nums[i + 2]) - (nums[i] - 1)) <= 2) {
                return true;
            }
        }
        return false;
    }

}