//Array-3 > squareUp
public class FillPattern {
    public int[] generateSquarePatternArray(int n) {
        int size = n * n;
        int[] result = new int[size];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                result[i * n - j] = j;


            }
        }
        return result;
    }
}