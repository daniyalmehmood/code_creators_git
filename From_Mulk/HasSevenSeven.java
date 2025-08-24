//Array-2 > has77
public class HasSevenSeven {
    public boolean containsDoubleOrSeparatedSevens(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] == 7 && nums[i + 1] == 7) || (i < nums.length - 2 && nums[i] == 7 && nums[i + 2] == 7)) {
                return true;
            }
        }
        return false;
    }

}












