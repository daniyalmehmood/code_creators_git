// Array-3 > squareUp
public class SquareUpArrayGenerator {
    public int[] generateSquareUpArray(int n) {
        int[] result = new int[n * n];
        for (int groups = 1; groups <= n; groups++) {
            for (int i = 0; i < groups; i++) {
                result[groups * n - 1 - i] = i + 1;
            }
        }
        return result;
    }
}