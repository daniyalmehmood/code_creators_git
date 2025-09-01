public class TeenSumCalculator {
    // Returns the sum of three integers, ignoring "teen" values except 15 and 16
    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }
    // Returns 0 if the number is a "teen" (13-19) except 15 and 16, otherwise returns the number itself
    public int fixTeen(int n) {
        if (n >= 13 && n <= 19 && n != 15 && n != 16) {
            return 0;
        }
        return n;
    }
}
