public class TrailStepAnalyzer {
    public int countBigSteps(int[] heights, int start, int end) {
        int count = 0;
        for (int i = start; i < end; i++) {
            if (Math.abs(heights[i] - heights[i + 1]) >= 5) {
                count++;
            }

        }
        return count;
    }

}
