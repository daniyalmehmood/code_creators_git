// AP-1 > sumHeights2
public class SumDoubleHeightCalculator {
    public int calculateSumDoubleClimb(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            int diff = heights[i + 1] - heights[i];
            if (diff > 0) {
                sum += diff * 2;
            } else {
                sum -= diff;
            }
        }
        return sum;
    }
}