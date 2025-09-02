// Recursion-1 > count7
public class DigitSevenCounter {
    public int countDigitSeven(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 10 == 7) {
            return 1 + countDigitSeven(n / 10);
        }
        return countDigitSeven(n / 10);
    }
}