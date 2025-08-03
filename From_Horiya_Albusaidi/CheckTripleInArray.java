public class CheckTripleInArray {
    public boolean containsTripleElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i + 2 < nums.length && nums[i] == nums[i + 1] && nums[i] == nums[i + 2])
                return false;
        }
        return true;
    }
}g