import java.util.Arrays;

public class IncrementalSeriesArray {//Array-3 > seriesUp
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createSeriesUp(3)));// → [1, 1, 2, 1, 2, 3]
        System.out.println(Arrays.toString(createSeriesUp(4)));// → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
        System.out.println(Arrays.toString(createSeriesUp(2)));// → [1, 1, 2]
    }
    public static int[] createSeriesUp(int n) {
        int[] result = new int[n * (n + 1) / 2];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                result[index++] = j;
            }
        }
        return result;
    }
}