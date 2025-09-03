//Array-3 > maxMirror
ublic class SquareUpPattern {
    public static int[] squareUp(int n) {
        int[] result = new int[n * n];

        // Loop over each row (1-based row index for easier math)
        for (int row = 1; row <= n; row++) {
            // Fill in the last 'row' positions with descending numbers
            for (int col = 0; col < row; col++) {
                // Position in array = (row-1)*n + (n-1-col)
                int position = (row - 1) * n + (n - 1 - col);
                result[position] = col + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(squareUp(3)));
        System.out.println(java.util.Arrays.toString(squareUp(2)));
        System.out.println(java.util.Arrays.toString(squareUp(4)));

    }
}