public class SquareUp{

    public static int[] squareUp(int n) {
        int[] res = new int[n * n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= n - i - 1) {
                    res[i * n + j] = n - j;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 3; // You can change this to test other values
        int[] result = squareUp(n);

        // Print the result
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
            if ((i + 1) % n == 0) System.out.println(); // Format as rows
        }
    }
}