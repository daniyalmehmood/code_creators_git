//Array-2 > sum67
public class SectionSkipper {
    public int sum67(int[] nums) {
        boolean toSection = false;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                toSection = true; // start skipping
            } else if (nums[i] == 7 && toSection) {
                toSection = false; // end skipping
            } else if (!toSection) {
                sum += nums[i]; // only add when not skipping
            }
        }

        return sum;
    }

}
