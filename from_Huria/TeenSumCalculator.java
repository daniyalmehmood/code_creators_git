public class TeenSumCalculator {

    public static int calculateNoTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public static int fixTeen(int n) {
        if ((n >= 13 && n <= 19) && n != 15 && n != 16) {
            return 0;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(calculateNoTeenSum(1, 2, 3));
        System.out.println(calculateNoTeenSum(2, 13, 1));
        System.out.println(calculateNoTeenSum(2, 1, 14));
    }
}
