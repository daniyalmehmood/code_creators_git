// Recursion-1 > count8
public class CountEightsCalculator {
    public int countDigitEight(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 10 == 8) {
            if ((n / 10) % 10 == 8) {
                return 2 + countDigitEight(n / 10);
            }
            return 1 + countDigitEight(n / 10);
        }
        return countDigitEight(n / 10);
    }
}