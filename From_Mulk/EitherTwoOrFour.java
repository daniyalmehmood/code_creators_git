// Array-2 > either24
public class EitherTwoOrFour {
    public boolean hasEitherTwoPairOrFourPair(int[] nums) {
        boolean found = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] == 2 && nums[i + 1] == 2) || (nums[i] == 4 && nums[i + 1] == 4)) {
                if (found) {
                    return false;
                }
                found = true;
                continue;
            }
        }
        return found;
    }
}




