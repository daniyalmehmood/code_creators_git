public class NearMultipleChecker {
    // Returns true if n is 1 or 2 less than a multiple of 20
    public boolean isLessThanMultipleOf20(int n) {
        return n % 20 == 18 || n % 20 == 19;
    }
}
