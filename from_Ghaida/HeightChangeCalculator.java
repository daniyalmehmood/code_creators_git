public class HeightChangeCalculator {//AP-1 > sumHeights
    public static void main(String[] args) {
        System.out.println(calculateTotalHeightChange(new int[]{5, 3, 6, 7, 2}, 2, 4)); // → 6
        System.out.println(calculateTotalHeightChange(new int[]{5, 3, 6, 7, 2}, 0, 1)); // → 2
        System.out.println(calculateTotalHeightChange(new int[]{5, 3, 6, 7, 2}, 0, 4)); // → 11
    }
    public static int calculateTotalHeightChange(int[] heights, int start, int end) {
        int totalHeightChange = 0;
        for (int i = start; i < end; i++) {
            totalHeightChange += Math.abs(heights[i] - heights[i + 1]);
        }
        return totalHeightChange;
    }
}
