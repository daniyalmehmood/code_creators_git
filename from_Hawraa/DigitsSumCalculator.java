// Recursion-1 > sumDigits
public class DigitsSumCalculator {
    public int getDigitsSum(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + getDigitsSum(n / 10);
    }
}