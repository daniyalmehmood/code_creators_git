//Recursion-1 > powerN

public class PowerCalculator {
    public int calculatePower(int base, int n) {
        if (n > 0) {
            return base * calculatePower(base, n - 1);
        }
        return 1;
    }
}