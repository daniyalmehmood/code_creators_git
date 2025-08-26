// AP-1 > hasOne
public class OneDigitChecker {
    public boolean hasOneDigit(int n) {
        while (0 < n) {
            int digit = n % 10; // get the rightmost digit.
            if (digit == 1) {
                return true;
            }
            n = n / 10; // remove rightmost digit.
        }
        return false;
    }
}