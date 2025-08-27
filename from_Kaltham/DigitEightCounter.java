//Recursion-1 > count8


public class DigitEightCounter {
    public int countEights(int n) {
        if (n > 0) {
            if (n % 10 == 8) {
                if (n % 100 == 88) {
                    return 2 + count8(n / 10);
                } else {
                    return 1 + count8(n / 10);
                }
            } else {
                return count8(n / 10);
            }
        }
        return 0;
    }
}