public class RoundSum {
    public int sumRoundedToNearest10(int a, int b, int c) {
        a = roundToNearest10(a);
        b = roundToNearest10(b);
        c = roundToNearest10(c);
        return a + b + c;
    }

    public int roundToNearest10(int n) {
        if (n % 10 >= 5) return n + (10 - n % 10);
        return n - n % 10;
    }
}
