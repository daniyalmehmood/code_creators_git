//Array-2 > twoTwo
public class DoubleTwoHalper {
    public static boolean allTwosArePaired(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                boolean leftIs2 = (i > 0) && (nums[i - 1] == 2);
                boolean rightIs2 = (i + 1 < nums.length) && (nums[i + 1] == 2);

                if (!leftIs2 && !rightIs2) {
                    // This 2 is alone
                    return false;
                }
            }

        }
        return true;
    }

}
