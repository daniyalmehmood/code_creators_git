//AP-1 > sumHeights
public class HeightTracker {
    public int sumAbsoluteHeightDifferences(int[] heights, int start, int end) {
        int sumHeight = 0;
        for (int i = start; i < end; i++) {
            sumHeight += Math.abs(heights[i + 1] - heights[i]);

        }
        return sumHeight;
    }

}