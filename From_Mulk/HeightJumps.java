//AP-1 > bigHeights
public class HeightJumps {
    public int countHeightDifferencesAboveOrEqualFive(int[] heights, int start, int end) {
        int countHeight = 0;
        int difference = 0;
        for (int i = start; i < end; i++) {
            difference = (Math.abs(heights[i + 1] - heights[i]));

            if (difference >= 5) {
                countHeight++;
            }
        }
        return countHeight;
    }
}

