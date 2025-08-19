public class SpacingChecker {
    public boolean areNumbersEvenlySpaced(int a, int b, int c) {
        if ((a + b == 2 * c) || (a + c == 2 * b) || (b + c == 2 * a)) {
            return true;
        }
        return false;
    }
    }