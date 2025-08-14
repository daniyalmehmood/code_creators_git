public class MoreOnesChecker {
    public boolean hasMoreOnesThanFours(int[]nums) {
        int countOfOne = 0;
        int countOfFour = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                countOfOne++;
            } else if (nums[i] == 4) {
                countOfFour++;
            }
        }
        return countOfOne > countOfFour;
    }
}