//AP-1 > scoresSpecial

public class SpecialScoreCalculator {
    public int sumLargestSpecial(int[]a, int[]b) {

        int firstSumOfA = findLargestSpecial(a);
        int firstSumOfB = findLargestSpecial(b);
        return firstSumOfA + firstSumOfB;

    }

    public int findLargestSpecial(int[]nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0 && nums[i] > max) {
                max = nums[i];
            }
        }
        return max;

    }
}