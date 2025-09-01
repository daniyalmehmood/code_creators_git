public class AdjacentPairsChecker {
    public boolean hasEitherTwoOrFour(int[] nums) {
        boolean isTwoNextTwo = false;
        boolean isFourNextFour = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                isTwoNextTwo = true;
            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                isFourNextFour = true;
            }
        }

        return isFourNextFour ^ isTwoNextTwo;
    }
}


