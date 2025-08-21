//Array-3 > seriesUp
public class SequenceArrayBuilder {
    public int[] buildIncrementalSeries(int n) {
        int[] result = new int[n * (n + 1) / 2];

        if (n == 0) return result;
        // Loop through rows/groups
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                int index = i * (i + 1) / 2 + j;
                result[index] = j + 1;

            }
        }

        return result;
    }
}
