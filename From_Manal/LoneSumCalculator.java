public class LoneSumCalculator {
    public static int calculateLoneSum(int a, int b, int c) {
        int sum = 0;
        if (a != b && a != c)
            sum += a;
        if (b != a && b != c)
            sum += b;
        if (c != a && c != b)
            sum += c;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(calculateLoneSum(1, 2, 3));
        System.out.println(calculateLoneSum(3, 2, 3));
        System.out.println(calculateLoneSum(3, 3, 3));
    }
}