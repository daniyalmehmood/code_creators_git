//Recursion-1 > sumDigits

public class NumberDigitSumCalculator {
    public int calculateDigitSum(int n) {
        if (n > 0) {
            return (n % 10) + calculateDigitSum(n / 10);
        }
        return 0;
    }
}