//Array-2 > sameEnds
public class SameEnds {
    public boolean hasMatchingStartAndEnd(int[] nums, int len) {
        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[nums.length - len + i]) {
                return false;
            }
        }
        return true;
    }
}