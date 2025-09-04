//AP-1 > sumHeights2
public class HeightsExtended {
    public int totalHeightChangeWithDoubleGain(int[] heights, int start, int end) {
        int sumHeight = 0;
        int difference = 0;
        for (int i = start; i < end; i++) {
            difference = (heights[i + 1] - heights[i]);

            if (difference > 0) {
                sumHeight += difference * 2;
            }
            if (difference < 0) {
                sumHeight += Math.abs(difference);
            }
        }
        return sumHeight;
    }
}