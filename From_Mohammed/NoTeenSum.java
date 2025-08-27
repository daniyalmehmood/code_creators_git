public class NoTeenSum {
    public int sumIgnoringTeens(int a, int b, int c) {
        a = adjustTeenValue(a);
        b = adjustTeenValue(b);
        c = adjustTeenValue(c);
        return a + b + c;
    }

    public int adjustTeenValue(int n) {
        if (n >= 13 && n <= 19 && n != 15 && n != 16) return 0;
        return n;
    }
}
