public class UniqueSumCalculator {
    public static int calculateLoneSum(int a, int b, int c) {
        int sum = a + b + c;
        if (a == b && b == c && c == b) return 0;
        if (a == b) return c;
        if (b == c) return a;
        if (c == a) return b;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calculateLoneSum(1, 2, 3));
        System.out.println(calculateLoneSum(3, 2, 3));
        System.out.println(calculateLoneSum(3, 3, 3));
    }
}
