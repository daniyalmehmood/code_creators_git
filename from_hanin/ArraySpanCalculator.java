//Array-3 > maxSpan
public class ArraySpanCalculator {
    public static int findLargestSpan(int[] nums) {
// Update maxSpan if this span is larger than the current maxSpan.
        int maxSpan = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= i; j--) {
                if (nums[i] == nums[j]) {
                    maxSpan = Math.max(maxSpan, j - i + 1);

                }
            }
        }
        return maxSpan;
    }

}
