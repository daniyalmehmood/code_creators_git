//AP-1 > sumHeights


public class HeightsCalculator {
    public int sumHeightDifferences(int[]heights, int start, int end) {
        int sumOfHigtht = 0;
        for (int i = start; i < end; i++) {
            sumOfHigtht = sumOfHigtht + Math.abs(heights[i] - heights[i + 1]);
        }
        return sumOfHigtht;
    }
}