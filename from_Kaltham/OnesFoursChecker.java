public class OnesFoursChecker {
    public boolean hasOnesAndFours(int[]nums) {
        boolean allOnesOrFours = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4) {
                allOnesOrFours = false;
            }
        }
        return allOnesOrFours;
    }
}