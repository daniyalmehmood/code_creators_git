//Array-2 > only14
public class OneFourFilter {

    public boolean checkOnlyOneAndFour(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4) {
                return false; // found a number that is not 1 or 4
            }
        }
        return true; // all numbers were 1 or 4
    }

}
