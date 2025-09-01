//Array-3 > squareUp
public class MatrixPatternGenerator {
    public int[] createPatternArray(int n) {
        int[] result = new int[n * n];

        if (n == 0) return result;

        // Loop through rows/groups
        for (int i = 1; i <= n; i++) {  //i from 1 to n (inclusive)

            // Loop to place countdown from i to 1
            for (int j = i; j > 0; j--) {
                // Calculate correct index in  array
                int index = (i - 1) * n + (n - j);
                result[index] = j;
            }
        }

        return result;
    }
}
