public class NumberSpacingChecker {
    /**
     * Checks if three integers are evenly spaced.
     * That means the difference between each pair is consistent.
     */
    public boolean areNumbersEvenlySpaced(int a, int b, int c) {
        if (b - a == c - b || c - a == b - c || a - b == c - a) {
            return true;
        }
        return false;
    }
}
