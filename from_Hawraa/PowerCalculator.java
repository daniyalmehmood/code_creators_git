// Recursion-1 > powerN
public class PowerCalculator {
    public int computePower(int base, int n) {
        if (n == 0) {
            return 1;
        }
        return base * computePower(base, n - 1);
    }
}