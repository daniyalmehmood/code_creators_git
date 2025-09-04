//AP-1 > bigHeights

public class HeightDifferencesCalculator {
    public int countBigHeightDifferences(int[]heights, int start, int end) {
        int countTheBigHigtht = 0;
        for (int i = start; i < end; i++) {
            int differenceOfHigtht = Math.abs(heights[i + 1] - heights[i]);
            if (differenceOfHigtht >= 5) {
                countTheBigHigtht++;
            }
        }
        return countTheBigHigtht++;
    }
}