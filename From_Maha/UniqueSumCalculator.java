public class UniqueSumCalculator {
    // Returns the sum of three integers, ignoring any values that are duplicated
    public int sumOfUniqueValues(int a, int b, int c) {
        if (a == b && b == c) {
            return 0;
        }
        if (a == b) {
            return c;
        }
        if (a == c) {
            return b;
        }
        if (b == c) {
            return a;
        }
        return a + b + c;
    }
}
