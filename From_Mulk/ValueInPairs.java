//Array-2 > isEverywhere
public class ValueInPairs {
    public boolean ValueInEveryAdjacentPair(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == val || nums[i + 1] == val) {
                count++;
            } else {
                return false;
            }
        }
        return true;
    }
}