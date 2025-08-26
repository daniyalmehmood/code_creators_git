public class LuckySumCalculator {
    public static int calculateLuckySum(int a, int b, int c) {
        int sum = a + b + c;
        if (a == 13) return 0;
        if (b == 13) return a;
        if (c == 13) return a + b;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calculateLuckySum(1, 2, 3));
        System.out.println(calculateLuckySum(1, 2, 13));
        System.out.println(calculateLuckySum(1, 13, 3));
    }
}
