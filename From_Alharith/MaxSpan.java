public class MaxSpan {

    public int getMaxElementSpan (int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= i; j--) {
                if (nums[i] == nums[j]) {
                    int span = j - i + 1;
                    if (span > max) {
                        max = span;
                    }
                    break;
                }
            }
        }
        return max;
    }

}
