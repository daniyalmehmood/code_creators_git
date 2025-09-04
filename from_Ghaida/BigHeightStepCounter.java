public class BigHeightStepCounter {//AP-1 > bigHeights
    public static void main(String[] args) {
        System.out.println(countBigSteps(new int[]{5, 3, 6, 7, 2}, 2, 4)); // → 1
        System.out.println(countBigSteps(new int[]{5, 3, 6, 7, 2}, 0, 1)); // → 0
        System.out.println(countBigSteps(new int[]{5, 3, 6, 7, 2}, 0, 4)); // → 1
    }
    public static int countBigSteps(int[] heights, int start, int end) {
        int bigStepCount = 0;
        for (int i = start; i < end; i++) {
            int heightDifference = Math.abs(heights[i] - heights[i + 1]);

            if (heightDifference >= 5) {
                bigStepCount++;
            }
        }
        return bigStepCount;
    }
}
