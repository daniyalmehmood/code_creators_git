//Array-3 > maxSpan
public class LargestSpan {
    public int findLongestValueSpan(int[] nums) {
        int maxSpam = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    int spam = j - i + 1;
                    if (spam > maxSpam) {
                        maxSpam = spam;
                    }
                }
            }
        }
        return maxSpam;
    }
}