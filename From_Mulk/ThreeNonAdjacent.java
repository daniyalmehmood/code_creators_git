//Array-2 > haveThree
public class ThreeNonAdjacent {
    public boolean hasExactlyThreeNonAdjacentThrees(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                count++;
                if (i < nums.length - 1 && nums[i + 1] == 3) {
                    return false;
                }
            }
        }
        return count == 3;
    }

}