// Array-3 > countClumps
public class ClumpsCounter {
    public int getClumpsCount(int[] nums) {
        int count = 0;
        boolean inClump = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                if (!inClump) {
                    count++;
                    inClump = true;
                }
            } else {
                inClump = false;
            }
        }
        return count;
    }
}