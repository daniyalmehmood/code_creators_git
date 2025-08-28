public class SumHeights {
    public static int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += Math.abs(heights[i + 1] - heights[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumHeights(new int[]{5, 3, 6, 7, 2}, 2, 4));
        System.out.println(sumHeights(new int[]{5, 3, 6, 7, 2}, 0, 1));
        System.out.println(sumHeights(new int[]{5, 3, 6, 7, 2}, 0, 4));
    }
}