//AP-1 > sumHeights2

public class WeightedHeightCalculator {
    public int sumHeightDifferencesWeighted(int[]heights, int start, int end) {
        int sumOfHigtht = 0;
        for (int i = start; i < end; i++) {
            if (heights[i + 1] > heights[i]) {
                sumOfHigtht = sumOfHigtht + (2 * Math.abs(heights[i] - heights[i + 1]));
            } else {
                sumOfHigtht = sumOfHigtht + Math.abs(heights[i] - heights[i + 1]);
            }
        }
        return sumOfHigtht;
    }
}