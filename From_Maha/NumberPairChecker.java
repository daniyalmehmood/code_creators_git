public class NumberPairChecker {
    public boolean double23(int[] nums) {
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < nums.length; i++) {
            // Count occurrences of 2 and 3
            if (nums[i] == 2) {
                count2++;
            }
            if (nums[i] == 3) {
                count3++;
            }

        }
        // Return true if either 2 or 3 appears exactly twice
        return count2 == 2 || count3 == 2;
    }
}
