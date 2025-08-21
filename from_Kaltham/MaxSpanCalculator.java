public class MaxSpanCalculator {
    public int calculateMaxSpan(int[]nums) {
        int firstIndex = 0;
        int lastIndex = 0;
        int firstNumber = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            firstNumber = nums[i];
            firstIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == firstNumber) {
                    lastIndex = j;

                }
            }
            int lengthBetweenIndexs = (lastIndex - firstIndex) + 1;
            if (max < lengthBetweenIndexs) {
                max = lengthBetweenIndexs;
            }

        }
        return max;
    }
}