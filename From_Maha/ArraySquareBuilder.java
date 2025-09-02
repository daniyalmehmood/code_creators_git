public class ArraySquareBuilder {
    public int[] buildSquarePattern(int n) {
        int[] resultArray = new int[n * n];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                resultArray[i * n - 1 - j] = j + 1;
            }
        }
        return resultArray;
    }
}
