//Array-2 > sum67
public class ArrayBlockSum {
    public int sumExcluding6To7(int[] nums) {
        int sum = 0;
        boolean inBlock = false;  // true when between 6 and 7
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                inBlock = true;   // start skipping
            }
            if (!inBlock) {
                sum += nums[i];   // only add if not in a 6...7 block
            }
            if (inBlock && nums[i] == 7) {
                inBlock = false;  // end skipping
            }
        }
        return sum;
    }
}
