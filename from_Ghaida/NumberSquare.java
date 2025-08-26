public class NumberSquare {//Array-3 > squareUp
    public static void main(String[] args) {
        System.out.println(makeSquarePattern(3));// → [0, 0, 1, 0, 2, 1, 3, 2, 1]
        System.out.println(makeSquarePattern(2));// → [0, 1, 2, 1]
        System.out.println(makeSquarePattern(4));// → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
    }
    public static int[] makeSquarePattern(int n) {
        int[] result = new int[n * n];
        if (n == 0) return result;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                result[i * n + (n - j - 1)] = j + 1; // fill the first j+1 elements in the row
            }
        }
        return result;
    }
}