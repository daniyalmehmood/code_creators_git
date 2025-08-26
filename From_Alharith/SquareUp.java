public class SquareUp {

    public int[] createSquareUpSequence(int n) {
        int[] result = new int[n * n];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - i) {
                    result[index++] = 0;
                } else {
                    result[index++] = n - j;
                }
            }
        }
        return result;
    }

}
