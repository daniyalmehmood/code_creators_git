//Array-2 > sameEnds
public class SameEndsHalper {
    public boolean haveSameEnds(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[nums.length - n + i]) {
                return false;
            }
        }
        return true;
    }

}
