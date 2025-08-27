//Array-3 > seriesUp
public class BuildSeries {
    public int[] generateIncrementalSeriesArray(int n) {
        int size = n * (n + 1) / 2;
        int index = 0;
        int[] result = new int[size];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                result[index] = j;
                index++;
            }
        }
        return result;
    }
}