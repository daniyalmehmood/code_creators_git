public class CheckElementsAppearance {
    public boolean checkIfNoOneOrFourElements(int[] nums) {
        boolean result = false;
        boolean isOne = false;
        boolean isFour = false;
        if (nums.length == 0) return true;
        for (int num : nums) {
            if (num == 1) isOne = true;
            if (num == 4) isFour = true;
            if (isOne && isFour) result = false;
            else result = true;
        }
        return result;
    }

}
