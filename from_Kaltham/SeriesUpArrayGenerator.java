public class SeriesUpArrayGenerator {
    public int[]generateSeriesUpPattern(int n) {
        int[]newArray = new int[n * (n + 1) / 2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                newArray[i * (i + 1) / 2 + j] = j + 1;
            }
        }
        return newArray;
    }
}