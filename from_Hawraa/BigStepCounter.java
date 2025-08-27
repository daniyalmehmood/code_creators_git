// AP-1 > bigHeights
public class BigStepCounter {
    public int countBigSteps(int[] heights, int start, int end) {
        int bigSteps = 0;
        for (int i = start; i < end; i++){
            int big = Math.abs(heights[i] - heights[i + 1]);
            if (big >= 5){
                bigSteps++;
            }
        }
        return bigSteps;
    }
}