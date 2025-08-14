public class OneTwoChecker {
    public boolean containsOneFollowedByTwo(int[]nums) {
        boolean foundOne = false;
        boolean foundTwo = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 1) {
                foundOne = true;
            }
            if (nums[i + 1] == 2) {
                foundTwo = true;
            }
        }
        return foundOne && foundTwo;
    }
}