//Array-2 > tripleUp
public class ThreeIncreasing {
    public boolean threeIncreasingAdjacentNumbers(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] - 1 && nums[i + 1] == nums[i + 2] - 1) {
                return true;
            }
        }
        return false;

    }

}