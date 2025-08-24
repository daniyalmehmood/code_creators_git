//Array-2 > has12
public class HasOneTwo {
    public boolean oneBeforeTwoChecker(int[] nums) {
        boolean hasOne = false;
        boolean hasTow = false;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1)
                hasOne = true;
            if (nums[i] == 2 && hasOne)
                return true;

        }

        return false;
    }
}
