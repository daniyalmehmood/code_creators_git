public class ClumpCounter {
    public static int findClumpCount(int[] nums) {
        boolean match = false;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] && !match) {
                match = true;
                count++;
            } else if (nums[i] != nums[i + 1]) {
                match = false;
            }
        }
        // Return the number of clumps in array
        return count;
    }

}
