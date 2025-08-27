//Array-2 > lucky13
public class LuckyArrayCheck {
    public boolean isLucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                return false;
            }
            if (nums[i] == 3) {
                return false;
            }
        }
        return true;
    }
}
