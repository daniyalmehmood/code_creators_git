public class CheckerTwoOrThree {
    public boolean ifItHaveTwoOrThree(int[] nums) {
        //if it has Two Or Three in first char
        if (nums[0] == 3 || nums[0] == 2) {
            return true;
        }
        if (nums[1] == 3 || nums[1] == 2) {
            return true;
        }
        return false;
    }

}
