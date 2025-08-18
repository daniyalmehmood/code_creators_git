public class LuckySum {
    public int sumUntilUnlucky(int a, int b, int c) {
        if (a == 13) {
            return 0;
        }
        if (b == 13) {
            return a;
        }
        if (c == 13) {
            return b + a;
        }
        return a + b + c;
    }
}