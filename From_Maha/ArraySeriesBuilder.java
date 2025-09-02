public class ArraySeriesBuilder {
    public int[] buildIncrementalSeries(int n) {
        int[] resultArray = new int[n * (n + 1) / 2];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                resultArray[index] = j;
                index++;
            }
        }

        return resultArray;
    }
}
