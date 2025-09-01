//Recursion-1 > count8
public class DigitEightCounter {
    public int countEightsWithBonus(int n) {
        if (n == 0) {
            return 0;
        } else {
            int lastDigit = n % 10;
            int remaining = n / 10;
            if (lastDigit == 8 && remaining % 10 == 8) {
                return 2 + countEightsWithBonus(remaining);
            } else if (lastDigit == 8) {
                return 1 + countEightsWithBonus(remaining);
            } else {
                return 0 + countEightsWithBonus(remaining);
            }
        }
    }
}

