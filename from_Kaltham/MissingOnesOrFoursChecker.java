public class MissingOnesOrFoursChecker {
    public boolean NotBothOneAndFourChecker(int[]nums) {
        boolean foundOne = false;
        boolean foundFour = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                foundOne = true;
            }
            if (nums[i] == 4) {
                foundFour = true;
            }
        }
        return (!foundOne || !foundFour);
    }
}