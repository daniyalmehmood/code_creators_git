public class HeightChangeWithDoubleIncreases {//AP-1 > sumHeights2
    public static void main(String[] args) {
        System.out.println(calculateWeightedHeightChange(new int[]{5, 3, 6, 7, 2}, 2, 4)); // → 7
        System.out.println(calculateWeightedHeightChange(new int[]{5, 3, 6, 7, 2}, 0, 1)); // → 2
        System.out.println(calculateWeightedHeightChange(new int[]{5, 3, 6, 7, 2}, 0, 4)); // → 15
    }
    public static int calculateWeightedHeightChange(int[] heights, int start, int end) {
        int totalChange = 0;
        for (int i = start; i < end; i++) {
            int difference = heights[i + 1] - heights[i];
            if (difference > 0) {
                totalChange += difference * 2; //increase counts double
            }
            else {
                totalChange += Math.abs(difference);
            }
        }
        return totalChange;
    }
}
