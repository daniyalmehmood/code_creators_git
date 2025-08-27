public class SquareUpBuilder {
    public int[]generateSquareUpPattern(int n) {
        int[]newArray = new int[n * n];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                newArray[i * n - j] = j;
            }
        }
        return newArray;
    }
}