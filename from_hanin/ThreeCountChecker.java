//Array-2 > haveThree
public class ThreeCountChecker {
    public boolean checkThreeNonAdjacent(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                count++;
                if (i + 1 < nums.length && nums[i + 1] == 3) {
                    return false;  // adjacent 3s found
                }
            }
        }
        return count == 3;
    }

}
