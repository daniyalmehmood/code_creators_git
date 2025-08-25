// Array-3 > seriesUp
public class SeriesUpArrayGenerator {
    public int[] generateSeriesUpArray(int n) {
        int arrayLength = n * (n + 1) / 2;
        int[] result = new int[arrayLength];
        int index = 0;
        for (int i = 1; i <= n; i++) { // numbers of groups
            for (int j = 1; j <= i; j++) {
                result[index++] = j;
            }
        }
        return result;
    }
}